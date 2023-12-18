import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// A, Bの入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		// 結果の出力
		System.out.println(Math.max(A*B, Math.max(A+B, A-B)));
		
		sc.close();
	}

}
