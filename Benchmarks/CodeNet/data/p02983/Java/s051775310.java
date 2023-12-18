import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long R = sc.nextLong();
        System.out.println(N);
        System.out.println(R);
        long ans = 9999;
        if (R-N>=2018) {
        	ans = 0;
        } else {
            N = N % 2019;
            R = R % 2019;
            System.out.println(N);
            System.out.println(R);
            if(N<R) {
            	long wk = 0;
            	for(long i=N; i<=R; i++) {
            		for(long j=i+1; j<=R; j++) {
            			wk = i*j%2019;
            			if(wk<ans) {
            				ans = wk;
            			}
            		}            		
            	}
            }else {
            	ans = 0;
            }
        }
        
        System.out.println(ans);
    }
}