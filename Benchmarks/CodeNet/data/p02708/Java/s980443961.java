import java.util.*; 
import java.lang.*; 

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
                int K = scan.nextInt();
                
                int[] cnt = new int[N+2];
                int ans = 0;
                
                int[] p = new int[N+2];
                int[] q = new int[N+2];
                
                 for(int a=1; a<=K;a++){
                        p[K] += a;
                    }
                 for(int b=N+1; b>=N+2-K;b--){
                        q[K] += b;
                    }
                 
                 cnt[K] = q[K]-p[K]+1;
                 
                for(int i=K+1; i<=N+1; i++){
                      p[i] = p[i-1] + i;
                      q[i] = q[i-1] + N+2-i;
                      cnt[i] = q[i]-p[i]+1;
                }
                
                for(int i=K; i<=N+1; i++){
                ans = ans + cnt[i];
                }
                ans =  ans%(10*10*10*10*10*10*10*10*10+7);
                
                System.out.println(ans);
                
	}
}