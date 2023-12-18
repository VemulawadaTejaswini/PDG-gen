import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		int k = sc.nextInt();
		String s = sc.next();
		// 文字列の入力
		String s = sc.next();
      	s.indexOf(k)-='A'-'a';
		// 出力
		System.out.println(s);
	}
}