import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A[] = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			int rev = sc.nextInt();
			A[rev] = i;
		}
		for (int i = 1; i <= N; i++) {
			System.out.print(A[i] + " ");
		}
    }
}