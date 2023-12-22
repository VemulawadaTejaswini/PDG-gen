import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int[] A = new int[N+1];
                int cnt = 0;
                int ans = 0;
                
                for(int i=1; i<=N;i++){
                    A[i] = scan.nextInt();
                }
                
                int[] min = new int[N+1];
                int[] max = new int[N+1];
                for(int i=1; i<=N;i++){
                     min[i] = i+A[i];
                     max[i] = i-A[i];
                }
                
                int[] sum = new int[N+1];
                for(int i=1;i<=N;i++){
                     if(max[i]>=0) ans = ans + sum[max[i]];
                     if(min[i]<=N) sum[min[i]]++;
                }
                System.out.println(ans);
        }
}
