import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] skewers = new int[2*n];
		for (int i = 0; i < 2*n; i++) {
			skewers[i] = sc.nextInt();
		}
		Arrays.sort(skewers);
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += skewers[2*i];
		}
		System.out.println(sum);
	}
}