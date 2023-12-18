import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		// 文字列の入力
		if (a == b && b == c) {
		    System.out.println("No");
		} else {
		    System.out.println("Yes");
		}
	}
}