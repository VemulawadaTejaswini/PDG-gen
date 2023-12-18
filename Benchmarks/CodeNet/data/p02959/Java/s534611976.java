import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N + 1];
		int[] b = new int[N];
		for(int i = 0; i < N + 1; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			b[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += Math.min(a[i], b[i]);
		}
	}

}
