import java.util.*;

public class Main {
	static class Node {
		Node parent;
		int value;
		Node right, left;

		Node(int value) {
			this.value = value;
			this.parent = null;
			this.right = null;
			this.left = null;
		}

		/**
		 * 値を追加して，rootのnodeを返す
		 * 
		 * @param value
		 * @return
		 */
		Node add(int value) {
			if (this.value >= value) {
				Node parent = new Node(value);
				parent.left = this;
				this.parent = parent;
				return parent;
			} else if (this.left == null && this.right == null) {
				this.right = new Node(value);
				this.right.parent = this;
				return this;
			} else if(this.right== null){
				if(this.left.value <= value) {
					// 右側につける
					this.right = new Node(value);
					this.right.parent = this;
					return this;
				}else {
					this.left.add(value);
					return this;
				}
			}else {
				// right != null && left == null
				if(this.right.value < value) {
					this.right.add(value);
					return this;
				}else {
					Node middle = new Node(value);
					middle.left = this.right;
					this.right.parent = middle;
					return this;
				}
			}
		}

		long getCost(long base) {
			if (this.left == null && this.right == null) {
				return this.value - base;
			} else if (this.left != null && this.right != null) {
				long result = 0;
				result += this.left.getCost(this.value);
				result += this.right.getCost(this.value);
				result += this.value - base;
				return result;
			} else if (this.left != null) {
				// leftのみ
				long result = 0;
				result += this.left.getCost((this.value));
				result += this.value - base;
				return result;
			} else {
				// rightのみ
				long result = 0;
				result += this.right.getCost(this.value);
				result += this.value - base;
				return result;
			}
		}
	}

	int N;
	int[] h;
	List<Deque<Integer>> sections;

	Main() {
		Scanner in = new Scanner(System.in);
		N = Integer.parseInt(in.nextLine());
		String[] tokens = in.nextLine().split(" ");
		h = new int[N];
		for (int i = 0; i < N; ++i) {
			h[i] = Integer.parseInt(tokens[i]);
		}
		in.close();
	}

	Node genTree(int[] h) {
		// 最初のnodeを作る
		Node root = new Node(h[0]);
		for (int i = 1; i < h.length; ++i) {
			root = root.add(h[i]);
		}
		return root;
	}

	public static void main(String[] args) {
		Main ins = new Main();
		Node root = ins.genTree(ins.h);
		System.out.println(root.getCost(0));
	}

}