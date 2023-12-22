import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			if(N + M == 0) break;
			
			int[] h = new int[N+1];
			int[] w = new int[M+1];
			for(int i=1; i<=N; i++) {
				h[i] = sc.nextInt();
			}
			for(int i=1; i<=M; i++) {
				w[i] = sc.nextInt();
			}
			
			int[] hs = new int[1500001];
			int[] ws = new int[1500001];
			
			for(int i=1; i<=N; i++) {
				int sum = 0;
				for(int j=1; j<=N; j++) {
					sum += h[j];
					hs[sum]++;
				}
			}
			for(int i=1; i<=M; i++) {
				int sum = 0;
				for(int j=1; j<=M; j++) {
					sum += w[j];
					ws[sum]++;
				}
			}
			int cnt = 0;
			for(int i=1; i<=1500000; i++) {
				cnt += hs[i] * ws[i];
			}
			System.out.println(cnt);
		}
	}
}
