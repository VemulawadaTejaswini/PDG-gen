import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();

		if(K <= A + B) {
			System.out.println(Math.min(K, A));
		}else {
			System.out.println(A-(K-A-B));
		}
	}
}
