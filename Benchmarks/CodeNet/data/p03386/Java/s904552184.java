
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		int max = 0;
		for (int i = A; i < A + K; i++) {
			if (i > B) {
				break;
			}
			max = i;
			System.out.println(max);
		}
		for (int i = B - K + 1; i <= B; i++) {
			if (A > i) {
				break;
			}
			if (max < i) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}