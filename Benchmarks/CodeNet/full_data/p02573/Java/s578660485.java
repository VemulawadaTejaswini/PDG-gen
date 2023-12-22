import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int M = scan.nextInt();
                
                int[] A = new int[M];
                int[] B = new int[M];
                
                int[][] cnt = new int[N+1][N+1];
                int[] ans = new int[N+1];
                
                for(int i=0; i<M;i++){
                    A[i] = scan.nextInt();
                    B[i] = scan.nextInt();
                    
                    if(cnt[A[i]][B[i]]!=1){
                        cnt[A[i]][B[i]]++;
                        ans[A[i]]++;
                    }
                    if(cnt[B[i]][A[i]]!=1){
                        cnt[B[i]][A[i]]++;
                        ans[B[i]]++;
                    }
                }
                int k = 0;
                for(int i=1; i<=N;i++){
                    k=Math.max(k, ans[i]);
                }
                
                System.out.println(k+1);
        }
}