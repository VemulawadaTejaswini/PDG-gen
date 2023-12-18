import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String s = sc.next();

		if ( s.charAt(2)==s.charAt(3) && s.charAt(4)==s.charAt(5) ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}