import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String s = sc.next();
		String t = sc.next();
		// スペース区切りの整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();

		String u = sc.next();

		if ( u.equals(s) ) {
			a--;
		} else {
			b--;
		}
		System.out.println(a + " " + b);
	}
}