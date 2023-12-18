import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力値
		char[] c = sc.next().toCharArray();
		sc.close();
		
		char r = c[0];
		System.out.println(++r);
	}
}