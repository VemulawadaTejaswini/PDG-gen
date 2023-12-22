import codejam.y2019.round1a.C;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static PrintWriter out;

	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		out = new PrintWriter(System.out);
		int N = sc.nextInt();
		char[][] words = new char[N][];
		root = new Node();
		for (int i = 0; i < N; i++) {
			words[i] = sc.next().toCharArray();
			insert(words[i], root, words[i].length - 1);
		}
		//print(root, "\t");
		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += calc(words[i]);
		}
		out.println(ans);
		
		out.flush();
	}

	static Node root;

	static class Node {
		Node[] children;
		int[] count;

		public Node() {
			children = new Node[26];
			count = new int[26];
		}
	}

	static int insert(char[] word, Node node, int pos) {
		if (pos == -1) return 0;
		int idx = word[pos] - 'a';
		Node child = node.children[idx];
		if (child == null) {
			node.children[idx] = child = new Node();
		}
		int ret = insert(word, child, pos - 1) | (1 << idx);
		for (int i = 0; i < 26; i++) if (contains(ret, i)) {
			node.count[i]++;
		}
		return ret | (1 << idx);
	}

	static int calc(char[] word) {
		Node cur = root;
		for (int i = word.length - 1; i >= 1; i--) {
			cur = cur.children[word[i] - 'a'];
		}
		//System.err.println(new String(word) + " => " + cur.count[word[0] - 'a']);
		return cur.count[word[0] - 'a'] - 1;
	}

	static void print(Node node, String tab) {
		if (node == null) throw new RuntimeException();
		for (int i = 0; i < 26; i++) {
			if (node.count[i] > 0) {
				System.err.print(tab + " count= " + (char) (i + 'a') + " => " + node.count[i]);
			}
		}
		System.err.println();
		for (int i = 0; i < 26; i++) {
			if (node.children[i] != null) {
				print(node.children[i], tab + (char) (i + 'a'));
			}
		}
	}

	static boolean contains(int mask, int pos) {
		return (mask & (1<<pos)) != 0;
	}

	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
}
