import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, T;
		N = sc.nextInt();
		T = sc.nextInt();
		int[] t = new int[N];
		for (int i = 0; i < N; i++) {
			t[i] = sc.nextInt();
		}

		long sum = 0;
		for (int i = 0; i < t.length; i++) {
			if(t[i] < sum) sum += T - (sum - t[i]);
			else sum += T;
		}

		System.out.println(sum);
	}
}