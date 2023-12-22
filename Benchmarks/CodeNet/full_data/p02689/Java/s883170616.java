import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int M = scan.nextInt();
                int[] H = new int[N+1];
                int[] A = new int[N+1];
                int[] B = new int[N+1];
                
                int cnt = 0;
 
                for(int i=1; i<=N;i++){
                    H[i] = scan.nextInt();
                }
                int[] MaxA = new int[N+1];
                for(int i=1; i<=M;i++){
                    A[i] = scan.nextInt();
                    B[i] = scan.nextInt();
                    
                    MaxA[A[i]] = Math.max(MaxA[A[i]], H[B[i]]);
                    MaxA[B[i]] = Math.max(MaxA[B[i]], H[A[i]]);
                }
                
                int ans = 0;
                for(int i=1; i<=N;i++){
                    if(H[i]>MaxA[i]){
                        ans++;
                    }
                }
                System.out.println(ans);
        }
}