import java.util.Arrays;
import java.util.Scanner;

	public class Main {

		static long mod = 1000000007;
		static long pattern[] = new long[1000001];

		public static void main(String[] args) {
			// AtCoder_C
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
    	    // Scannerクラスのインスタンスをクローズ
    		sc.close();

    		Arrays.fill(pattern, -1);

    		long ans=0;

    		for(int C=1; C<N; C++) {
    			int AB = N-C;
    			int cnt = 0;
    			for(int A=1; A<=Math.sqrt(AB); A++) {
    				if(pattern[AB] != -1) {
    					ans += pattern[AB];
    				} else if(AB%A==0) {
    					if(AB/A == A) {
        					ans++;
        					cnt++;
    					} else {
        					ans += 2;
        					cnt += 2;
    					}
    				}
    			}
				if(pattern[AB] != -1) {
					pattern[AB] = cnt;
				}
    		}
    		System.out.println(ans);
    	}
    }