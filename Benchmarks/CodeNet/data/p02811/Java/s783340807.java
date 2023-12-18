import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力値
		int k = sc.nextInt();
		int x = sc.nextInt();
		sc.close();
		System.out.println((k*500)>=x?"Yes":"No");
	}
}