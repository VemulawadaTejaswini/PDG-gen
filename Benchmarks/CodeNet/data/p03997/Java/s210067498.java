import java.util.Scanner;

/**
 * https://abc045.contest.atcoder.jp/tasks/abc045_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		sc.close();
		
		System.out.println(((a+b)*h)/2);

	}

}
