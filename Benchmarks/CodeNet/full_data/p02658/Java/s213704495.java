import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] multi = new int[N];

		int A = sc.nextInt();
		A = 0;
      
		for (int i = 0; i < N; i++) {
			A *= multi[i];
		}
		if (A >= Math.pow(10, 17)) {
			System.out.println(-1);
		} else {
			System.out.println(A);
		}
	}
}