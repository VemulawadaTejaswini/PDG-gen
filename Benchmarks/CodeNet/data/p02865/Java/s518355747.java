import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Nの入力
		int N = sc.nextInt();
		
		// 結果の出力
		int result = (int) (N % 2 == 0 ? Math.floor(N/2) - 1 : Math.floor(N/2));
		System.out.println(result);
		
		sc.close();
	}

}
