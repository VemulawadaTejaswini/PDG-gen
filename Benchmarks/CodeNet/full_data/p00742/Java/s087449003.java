import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	String[] words;
	char[] set;
	int ans;

	Main() throws FileNotFoundException {
		InputStream in = System.in;
		//InputStream in = new FileInputStream("2009c.txt");
		Scanner scanner = new Scanner(in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			ans = 0;
			words = new String[n];
			for (int i = 0; i < words.length; i++)
				words[i] = scanner.next();
			HashSet<Character> hset = new HashSet<Character>();
			for (int i = 0; i < words.length; i++) {
				for (int j = 0; j < words[i].length(); j++) {
					hset.add(words[i].charAt(j));
				}
			}
			int c = 0;
			set = new char[hset.size()];
			for (char hs : hset) {
				set[c++] = hs;
			}
			int[] s = new int[10];
			for(int i=0; i < 10; i++) {
				s[i] = i;
			}
			r = set.length;
			permutation(s, new int[0], 1);
			System.out.println(ans);
		}

	}

	int r;

	public void permutation(int[] s, int[] t, int n) {
		// TODO: 再帰による順列出力
		if (n == r + 1) {
			// 順列作成終了: 検査
			if (isValid(t))
				ans++;
		} else {
			for (int i = 0; i < s.length; i++) {
				int j;
				// s[i]を t に追加した順列を作る
				int[] nt = new int[t.length + 1];
				for (j = 0; j < t.length; j++)
					nt[j] = t[j];
				nt[j] = s[i];
				// s[i]を s から除いた順列を作る
				int[] ns = new int[s.length - 1];
				int ptr = 0;
				for (j = 0; j < s.length; j++)
					if (j != i)
						ns[ptr++] = s[j];
				// 再帰
				permutation(ns, nt, n + 1);
			}
		}

	}

	private boolean isValid(int[] t) {
		// TODO 自動生成されたメソッド・スタブ
		int lvalue = 0;
		for (int i = 0; i < words.length - 1; i++) {
			String word = words[i];
			for (int j = 0; j < set.length; j++) {
				word = word.replace(set[j], (char) (t[j] + '0'));
			}
			if(word.length() > 1 && word.charAt(0) == '0')
				return false;
			lvalue += Integer.valueOf(word);
		}
		int rvalue = 0;
		String word = words[words.length - 1];
		for (int j = 0; j < set.length; j++) {
			word = word.replace(set[j], (char) (t[j] + '0'));
		}
		if(word.length() > 1 && word.charAt(0) == '0')
			return false;
		rvalue = Integer.valueOf(word);
		if(lvalue == rvalue)
			return true;
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			new Main();
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		// int[] a = {0, 1, 2, 3};
		// do {
		// for(int i=0; i < a.length; i++)
		// System.out.print(a[i] + " ");
		// System.out.println();
		// } while(nextPermutation(a));
	}

}