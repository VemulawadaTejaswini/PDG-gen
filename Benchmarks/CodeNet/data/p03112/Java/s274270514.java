import java.util.*;

public class Main {
	enum Type {
		S, T, ORIGIN
	}

	static class Node {
		Type type;
		long val;

		Node(Type type, long val) {
			this.type = type;
			this.val = val;
		}
	}

	int A, B;
	int Q;
	long[] s, t, x;
	List<Node> nodes;
	List<Integer> originIndexes;
	List<Long> results;
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
		results = new ArrayList<>(Q);
		for (int i = 0; i < Q; ++i) {
			results.add(find(originIndexes.get(i)));
		}
	}

	void show() {
		for (int i = 0; i < Q; ++i) {
			System.out.println(results.get(i));
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
			nodes.add(new Node(Type.S, s[i]));
		}
		for (int i = 0; i < B; ++i) {
			nodes.add(new Node(Type.T, t[i]));
		}
		for (int i = 0; i < Q; ++i) {
			nodes.add(new Node(Type.ORIGIN, t[i]));
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
		// ここで左右の寺，神社が発見
		List<Node> ns = new ArrayList<>(5);
		ns.add(rs);
		ns.add(rt);
		ns.add(ls);
		ns.add(lt);
		ns.add(origin);
		Collections.sort(ns, comp);
		// 先に右-> 右
		long result = ns.get(4).val - ns.get(2).val;
		// 先に左-> 左
		result = Math.min(result, ns.get(2).val - ns.get(0).val);
		// 右-> 左
		if (ns.get(3).type != ns.get(1).type) {
			result = Math.min(result, ns.get(3).val - ns.get(2).val + ns.get(3).val - ns.get(1).val);
		} else {
			result = Math.min(result, ns.get(3).val - ns.get(2).val + ns.get(3).val - ns.get(0).val);
		}
		// 左 -> 右
		if (ns.get(1).type != ns.get(3).type) {
			result = Math.min(result, ns.get(2).val - ns.get(1).val + ns.get(3).val - ns.get(1).val);
		} else {
			result = Math.min(result, ns.get(2).val - ns.get(1).val + ns.get(4).val - ns.get(1).val);
		}
		return result;

	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		ins.show();
	}

}