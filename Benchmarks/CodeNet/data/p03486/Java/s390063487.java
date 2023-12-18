import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();   //標準入力
		String t = sc.next();   //標準入力
		String ans = " ";

		ArrayList<String> lists = new ArrayList<String>();
		ArrayList<String> listt = new ArrayList<String>();

		Collections.sort(lists) ;   //リストを降順でソート
		Collections.sort(listt, Collections.reverseOrder());   //リストを昇順でソート

		if (lists.compareTo(listt) == -1) {
			ans = "Yes";
		} else {
			ans = "No";
		}
		System.out.println(ans);
	}
}
