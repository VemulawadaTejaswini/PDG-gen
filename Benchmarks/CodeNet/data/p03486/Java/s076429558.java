import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();   //標準入力
		String t = sc.next();   //標準入力
		String ans = " ";

		int[] lists = new int[s.length()] ;
		int[] listt = new int[t.length()] ;

		Arrays.sort(lists) ;   //リストを降順でソート
		String strlists = Arrays.toString(lists);
		Arrays.sort(listt) ;   //リストを昇順でソート
		String strlistt = Arrays.toString(listt);

		if (strlists.compareTo(strlistt) < 0) {
			ans = "Yes";
		} else {
			ans = "No";
		}
		System.out.println(ans);
	}
}
