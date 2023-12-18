import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		int N = scanner.nextInt();
 		int sum = 0;
 		int tako[] = new int[N];
 		for (int i = 0; i < N; i++) {
 			tako[i] = scanner.nextInt();
 		}
 		for (int i = 0; i < N - 1; i++) {
 			for (int j = i + 1; j < N; j++) {
 				sum += tako[i] * tako[j];
 			}
 		}
 		System.out.println(sum);
	}
}
