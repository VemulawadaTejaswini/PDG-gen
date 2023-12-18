import java.util.*; 
import java.lang.*; 

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
                int K = scan.nextInt();
                
                int[] cnt = new int[N+2];
                int ans = 0;
                
                int p = 0;
                int q = 0;
                for(int i=K; i<=N+1; i++){
                p = 0;
                q = 0;
                    for(int a=1; a<=i;a++){
                        p += a;
                    }
                    for(int b=N+1; b>=N+2-i;b--){
                        q += b;
                    }
                    cnt[i] = q-p+1;
                }
                
                for(int i=K; i<=N+1; i++){
                ans = ans + cnt[i];
                }
                ans =  ans%(10*10*10*10*10*10*10*10*10+7);
                
                System.out.println(ans);
                
	}
}
    