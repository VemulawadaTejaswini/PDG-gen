import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Nの入力
		int N = sc.nextInt();
		
		// 3桁のパスワードのパターンを出力
		double pattern = Math.pow(N, 3);
		System.out.println(pattern);
		sc.close();
	}
}
