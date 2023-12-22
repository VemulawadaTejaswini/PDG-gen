import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	static class Node {
		long MOD = 998244353L;
		long val, base;
		int num;
		int leftIndex, rightIndex;
		Node left, right;

		Node(long val, int leftIndex, int rightIndex) {
			this.val = val;
			this.leftIndex = leftIndex;
			this.rightIndex = rightIndex;
		}

		long getVal(int l, int r) {
			if (l <= this.leftIndex && this.rightIndex <= r) {
				return val;
			} else if (this.rightIndex < l || r < this.leftIndex) {
				return 0L;
			} else {
				return (this.left.getVal(l, r) + this.right.getVal(l, r)) % MOD;
			}
		}

		long update(int newNum, int l, int r) {
			// まずこのnodeの対象内かを判定
			if (this.rightIndex < l || r < this.leftIndex) {
				// 更新がないので，このnodeの値を返す
				return this.val;
			} else {
				if (this.leftIndex != this.rightIndex) {
					// 子側へ伝達
					long val = (this.left.update(newNum, l, r) + this.right.update(newNum, l, r)) % MOD;
					this.val = val;
					return val;
				} else {
					if (l <= this.leftIndex && this.rightIndex <= r) {
						val += (long) (newNum - num) * base + MOD;
						val %= MOD;
						num = newNum;
						return val;
					} else {
						return this.val;
					}
				}
			}
		}
	}

	int N, Q;
	long[] mods;
	long mod = 0L;
	long MOD = 998244353L;
	int[] L, R, D;
	int[] lasts;
	int treeSize;
	Node root;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		Q = Integer.parseInt(tokens[1]);

		L = new int[Q + 1];
		R = new int[Q + 1];
		D = new int[Q + 1];
		L[0] = 0;
		R[0] = N - 1;
		D[0] = 1;
		for (int i = 0; i < Q; ++i) {
			tokens = in.readLine().split(" ");
			L[i + 1] = Integer.parseInt(tokens[0]) - 1;
			R[i + 1] = Integer.parseInt(tokens[1]) - 1;
			D[i + 1] = Integer.parseInt(tokens[2]);
		}
		treeSize = 1;
		while (treeSize < N) {
			treeSize *= 2;
		}

		// segTreeを作る
		mods = new long[N];
		mods[N - 1] = 1L;
		for (int i = N - 2; i >= 0; --i) {
			mods[i] = mods[i + 1] * 10L % MOD;
		}

		Node[] nodes = new Node[treeSize];
		for (int i = 0; i < N; ++i) {
			nodes[i] = new Node(mods[i], i, i);
			nodes[i].base = mods[i];
			nodes[i].num = 1;

		}
		for (int i = N; i < treeSize; ++i) {
			nodes[i] = new Node(0L, i, i);
			nodes[i].base = 0L;
			nodes[i].num = 0;
		}
		while (nodes.length > 1) {
			Node[] upper = new Node[nodes.length / 2];
			for (int i = 0; i < upper.length; ++i) {
				int l = nodes[i * 2].leftIndex;
				int r = nodes[i * 2 + 1].rightIndex;
				long val = (nodes[i * 2].val + nodes[i * 2 + 1].val) % MOD;
				upper[i] = new Node(val, l, r);
				upper[i].left = nodes[i * 2];
				upper[i].right = nodes[i * 2 + 1];
			}
			nodes = upper;
		}
		root = nodes[0];
	}

	void calc() {
		for (int i = 1; i <= Q; ++i) {
			root.update(D[i], L[i], R[i]);
			System.out.println((root.getVal(0, N - 1) % MOD));
		}
	}

	void showResult() {
	}
}