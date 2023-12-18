import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static ArrayList<String> list;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 文字数
		int n = sc.nextInt();

		// 順列のリストを格納する変数
		list = new ArrayList<>();

		// p,qの入力受け取り
		String p = "";
		String q = "";
		String[] p_sort = new String[n]; // 順列の最初の要素を格納したい
		for (int i = 0; i < n; i++) {
			String tmp = sc.next();
			p += tmp;
			p_sort[i] = tmp;
		}
		for (int i = 0; i < n; i++) {
			q += sc.next();
		}

		Arrays.parallelSort(p_sort); // p_sortを順列の最初の要素にした
		String p_sort_str = "";
		for (String p_sort_tmp : p_sort) {
			p_sort_str += p_sort_tmp;
		}

		// listに値を詰めていく
		permutation(p_sort_str, "");

		// indexの絶対値を出力
		System.out.println(Math.abs(list.indexOf(q) - list.indexOf(p)));
	}

	public static void permutation(String q, String ans) {
		// Base Case
		if (q.length() <= 1) {
			list.add(ans + q);
		}
		// General Case
		else {
			for (int i = 0; i < q.length(); i++) {
				permutation(q.substring(0, i) + q.substring(i + 1),
						ans + q.charAt(i));
			}
		}
	}
}