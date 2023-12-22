import java.util.Scanner;

	public class Main {

		static long mod = 1000000007;

		public static void main(String[] args) {
			// AtCoder_C
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
    	    // Scannerクラスのインスタンスをクローズ
    		sc.close();

    		long ans=0;

    		for(int C=1; C<N; C++) {
    			int AB = N-C;
    			for(int A=1; A<=Math.sqrt(AB); A++) {
    				if(AB%A==0) {
    					ans++;
    					if(AB/A != A) {
        					ans++;
    					}
    				}
    			}
    		}
    		System.out.println(ans);
    	}
    }