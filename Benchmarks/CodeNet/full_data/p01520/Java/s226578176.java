import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int E = sc.nextInt();
		int[] c = new int[N];
		for(int i=0;i<N;i++) {
			c[i] = sc.nextInt();
		}
		int ans = -1;
		loop:for(int i=0;i<N;i++) {
			if(c[i] > T+E) continue;
			for(int t=c[i];t<=T+E;t+=c[i]) {
				if(T-E <= t && t<= T+E) {
					ans = i+1;
					break loop;
				}
			}
		}
		System.out.println(ans);
	}	
}



