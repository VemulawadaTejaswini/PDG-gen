import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] za = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			za[i][0] = sc.nextInt();
			za[i][1] = sc.nextInt();
		}
		
		Arrays.sort(za, (a1, a2) -> Integer.compare(a1[1], a2[1]));
		int total = 100;
		
		for(int k = 0; k < N; k++) { 
			for(int i = k + 1; i < N; i++) {
				int p = za[i][0] - za[k][0];
				int q = za[i][1] - za[k][1];
				int cost = k + 1 + i - 1;
				for(int j = i + i; j < N; j += i) {
					if(za[j][0] == za[j - i][0] + p && za[j][1] == za[j - i][1] + q) {
						continue;
					} else {
						cost++;
				//		System.out.println(cost);
					}
				}
				total = Math.min(total, cost);
		//		System.out.println(total);
			}
		}
		System.out.println(total);
	}
}
