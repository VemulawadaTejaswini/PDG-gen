import java.util.*;

public class Main {
	enum Type {
		S, T, ORIGIN
	}

	static class Node {
		Type type;
		long val;
		int index;

		Node(Type type, long val, int index) {
			this.type = type;
			this.val = val;
			this.index = index;
		}
	}

	int A, B;
	int Q;
	long[] s, t, x;
	List<Node> nodes;
	List<Integer> originIndexes;
	long[] results;
	Comparator<Node> comp = new Comparator<Node>() {
		@Override
		public int compare(Node o1, Node o2) {
			if (o1.val < o2.val) {
				return -1;
			} else if (o1.val > o2.val) {
				return 1;
			} else {
				return 0;
			}
		}
	};

	void calc() {
		results = new long[Q];
		for (int i = 0; i < Q; ++i) {
			int originIndex = originIndexes.get(i);
			long minVal = find(originIndex);
			int index = nodes.get(originIndex).index;
			results[index] = minVal;

		}
	}

	void show() {
		for (int i = 0; i < Q; ++i) {
			System.out.println(results[i]);
		}
	}

	Main() {
		Scanner in = new Scanner(System.in);
		A = in.nextInt();
		B = in.nextInt();
		Q = in.nextInt();
		s = new long[A];
		t = new long[B];
		x = new long[Q];
		for (int i = 0; i < A; ++i) {
			s[i] = in.nextLong();
		}
		for (int i = 0; i < B; ++i) {
			t[i] = in.nextLong();
		}
		for (int i = 0; i < Q; ++i) {
			x[i] = in.nextLong();
		}
		in.close();
	}

	void init() {
		nodes = new ArrayList<>(A + B + Q);
		for (int i = 0; i < A; ++i) {
			nodes.add(new Node(Type.S, s[i], i));
		}
		for (int i = 0; i < B; ++i) {
			nodes.add(new Node(Type.T, t[i], i));
		}
		for (int i = 0; i < Q; ++i) {
			nodes.add(new Node(Type.ORIGIN, x[i], i));
		}
		nodes.sort(comp);

		this.originIndexes = new ArrayList<>(Q);
		for (int i = 0; i < A + B + Q; ++i) {
			if (nodes.get(i).type == Type.ORIGIN) {
				originIndexes.add(i);
			}
		}
	}

	long find(int originIndex) {
		Node origin = nodes.get(originIndex);
		Node rs = null, rt = null, ls = null, lt = null;
		for (int i = originIndex + 1; i < nodes.size(); ++i) {
			Node node = nodes.get(i);
			if (node.type == Type.S) {
				if (rs == null)
					rs = node;
			} else if (node.type == Type.T) {
				if (rt == null) {
					rt = node;
				}
			}
			if (rs != null && rt != null) {
				break;
			}
		}
		for (int i = originIndex - 1; i >= 0; --i) {
			Node node = nodes.get(i);
			if (node.type == Type.S) {
				if (ls == null)
					ls = node;
			} else if (node.type == Type.T) {
				if (lt == null) {
					lt = node;
				}
			}
			if (ls != null && lt != null) {
				break;
			}
		}
		long result = Long.MAX_VALUE;
		// ここで左右の寺，神社が発見
		if (rs != null && rt != null) {
			result = Math.min(result, calcEachResult(origin, rs, rt));
		}
		if (rs != null && lt != null) {
			result = Math.min(result, calcEachResult(origin, rs, lt));
		}
		if (ls != null && lt != null) {
			result = Math.min(result, calcEachResult(origin, ls, lt));
		}
		if (ls != null && rt != null) {
			result = Math.min(result, calcEachResult(origin, ls, rt));
		}
		return result;

	}

	long calcEachResult(Node origin, Node shine, Node temple) {
		long result = 0;
		result += Math.min(Math.abs(shine.val - origin.val), Math.abs(temple.val - origin.val));
		result += Math.abs(shine.val - temple.val);
		return result;
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.init();
		ins.calc();
		ins.show();
	}

}