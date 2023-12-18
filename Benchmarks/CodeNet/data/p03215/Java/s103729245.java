import java.util.*;

public class Main {
	private static class Node {
		long val;
		String binStr;
		int tajuu = 1;
		Set<Integer> indexes = new HashSet<>();

		public Node(long val, String binStr) {
			this.val = val;
			this.binStr = binStr;
		}
	}

	Comparator<Node> comp = new Comparator<Node>() {
		@Override
		public int compare(Node o1, Node o2) {
			if (o1.val < o2.val) {
				return 1;
			} else if (o1.val > o2.val) {
				return -1;
			} else {
				if (o1.indexes.size() < o2.indexes.size()) {
					return -1;
				} else if (o1.indexes.size() > o2.indexes.size()) {
					return 1;
				} else {
					return 0;
				}
			}
		}
	};
	int N, K;
	List<Long> a;
	List<Long> sums;
	Queue<Node> nodes;
	List<Node> targets;
	long result;

	Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		K = in.nextInt();
		a = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			a.add(in.nextLong());
		}
		in.close();
		sums = new ArrayList<>(N * (N + 1) / 2);
	}

	long binStrAnd(String one, String another) {
		long addVal = 1L;
		long result = 0L;
		for (int i = 1; i <= Math.min(one.length(), another.length()); ++i) {
			int oneIndex = one.length() - i;
			int anotherIndex = another.length() - i;
			if (one.charAt(oneIndex) == '1' && another.charAt(anotherIndex) == '1') {
				result += addVal;
			}
			addVal *= 2;
		}
		return result;
	}

	Node marge(Node one, Node another) {
		long val = binStrAnd(one.binStr, another.binStr);
		String binStr = Long.toBinaryString(val);
		Node result = new Node(val, binStr);
		result.tajuu = one.tajuu + another.tajuu;
		result.indexes = new HashSet<>();
		result.indexes.addAll(one.indexes);
		result.indexes.addAll(another.indexes);
		return result;
	}

	boolean[][] toBitArray(List<Node> nodes) {
		boolean[][] bitArray = new boolean[targets.size()][targets.get(0).binStr.length()];
		for (int i = 0; i < targets.size(); ++i) {
			Node node = nodes.get(i);
			Arrays.fill(bitArray[i], false);
			for (int j = node.binStr.length() - 1; j >= 0; --j) {
				int index = bitArray[i].length - 1 - (node.binStr.length() - 1 - j);
				if (node.binStr.charAt(j) == '1') {
					bitArray[i][index] = true;
				} else {
					bitArray[i][index] = false;
				}
			}
		}
		return bitArray;
	}

	long findResult(boolean[][] bitArray) {
		Set<Integer> result = new HashSet<>();
		long val = 0L;
		long addVal = 1L;
		for (int w = bitArray[0].length - 1; w >= 0; --w) {
			result.clear();
			for (int h = 0; h < bitArray.length; ++h) {
				if (bitArray[h][w]) {
					result.add(h);
				}
			}
			if (result.size() >= K) {
				val += addVal;
			}
			addVal *= 2;
		}
		return val;
	}

	/**
	 * 先頭の多重度 >= K; それが答え 先頭の多重度 < K; 残りの要素とandを計算し，多重度を追加し，計算対象に加える
	 */
	void calc() {
		boolean[][] bitArray = toBitArray(this.targets);
		result = findResult(bitArray);

	}

	void calcTargets() {
		this.targets = new ArrayList<>();
		int limitLength = this.nodes.peek().binStr.length();
		this.targets.add(this.nodes.poll());
		while (!this.nodes.isEmpty()) {
			Node node = this.nodes.poll();
			if (node.binStr.length() == limitLength) {
				targets.add(node);
			} else {
				if (this.targets.size() >= K) {
					// もう十分
					break;
				} else {
					limitLength = node.binStr.length();
					targets.add(node);
				}
			}
		}
	}

	void calcSums() {
		for (int i = 0; i < N; ++i) {
			long sum = 0;
			for (int j = i; j < N; ++j) {
				sum += a.get(j);
				sums.add(sum);
			}
		}
		Collections.sort(sums);

		// Nodeに格納する
		this.nodes = new PriorityQueue<Node>(comp);
		for (Long sum : sums) {
			String binStr = Long.toBinaryString(sum);
			this.nodes.add(new Node(sum, binStr));
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calcSums();
		ins.calcTargets();
		ins.calc();
		System.out.println(ins.result);
	}

}