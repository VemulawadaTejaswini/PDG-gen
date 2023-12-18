import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] sticks = new int[N];
		
		for (int i = 0; i < N; i++) {
			sticks[i] = sc.nextInt();
		}
		
		Arrays.sort(sticks);
		
		int sum = 0;
		for (int j = N - 1; j > N - 1 -K; j--) {
			sum += sticks[j];
		}
		
		System.out.println(sum);
		
		
	}
}


