import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;

public class Main {

	String text, max;
	int ans;

	class Node implements Comparable<Node> {
		String word = "";
		int fre = 1;
		int len;

		Node(String word) {
			this.word += word;
			this.len = word.length();
		}

		public int compareTo(Node b) {
			return b.fre - fre;
		}
	}

	Node node[];

	void in(String str) {
		if (ans == 0) {
			node[0] = new Node(str);
			ans++;
			return;
		}
		for (int i = 0; i < ans; i++) {
			if (str.equals(node[i].word)) {
				node[i].fre++;
				return;
			}
		}
		node[ans] = new Node(str);
		ans++;
	}

	void getWords() {
		String str = "";
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) != ' ')
				str += text.charAt(i);
			if (text.charAt(i) == ' ' || i == text.length() - 1) {
				in(str);
				if (str.length() > max.length()) {
					max = "";
					max += str;
				}
				str = "";
			}
		}
	}

	void run() throws Exception {
		while (cin.hasNext()) {
			node = new Node[1000];
			max = "";
			ans = 0;
			text = cin.nextLine();
			getWords();
			Arrays.sort(node, 0, ans);
			System.out.println(node[0].word + " " + max);
		}
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	static Scanner cin = new Scanner(new BufferedInputStream(System.in));
}