import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] h = new int[N + 1];
		int[] hs = new int[N + 1];
		int[] x = new int[N + 1];
		
		for(int i = 1; i <= N; i++) {
			h[i] = sc.nextInt();
			hs[i] = h[i];
			x[i] = 0;
		}
		
		int count = 0;
		Arrays.sort(hs);
		
		for(int j = 1; j <= hs[N]; j++) {
			for(int i = 1; i <= N; i++) {
				if(x[i] < h[i]) {
					x[i] += 1;
					if(i == N || x[i + 1] == h[i + 1]) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
