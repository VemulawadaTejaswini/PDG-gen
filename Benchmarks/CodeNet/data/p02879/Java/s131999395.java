import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);

		int ans = sc.nextInt();
		if(ans <= 81 &&((ans %2 ==0) || (ans %3 ==0) || (ans %4 ==0)|| (ans %5 ==0)|| (ans %6 ==0)|| (ans %7 ==0)|| (ans %8 ==0)|| (ans %9 ==0))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		// Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}