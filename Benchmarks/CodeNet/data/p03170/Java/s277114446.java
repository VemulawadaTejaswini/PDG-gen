import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int N = sc.nextInt(), K = sc.nextInt();
			int[] a = new int[N];
			for(int i = 0; i < N; i++) {
				a[i] = sc.nextInt();
			}
			boolean[] dp = new boolean[K + 1];
			Arrays.fill(dp, false);
			for(int i = 1; i <= K; i++) {
				for(int j = 0; j < N; j++) {
					if(i - a[j] >= 0) {
						dp[i] |= !dp[i - a[j]];
					}
				}
			}
			System.out.println(dp[K] ? "First" : "Second");
		}
	}
}