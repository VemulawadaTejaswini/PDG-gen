import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		for (int i = A; i < A + K; i++) {
			System.out.println(i);
		}
		for (int i = B - K + 1; i <= B; i++) {
			System.out.println(i);
		}
	}
}
