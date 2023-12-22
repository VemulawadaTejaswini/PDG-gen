import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int M = scan.nextInt();
                
                int[] A = new int[M];
                int[] B = new int[M];
                
                int[] fri = new int[N+1];
                
                for(int i=0; i<M; i++){
                    A[i] = scan.nextInt();
                    B[i] = scan.nextInt();
                    
                    int min = Math.min(A[i], B[i]);
                    int max = Math.max(A[i], B[i]);
                    
                    if(fri[min]==0){
                        fri[min] = min;
                        fri[max] = min;
                    }else{
                        fri[max] = fri[min];
                    }
                }
                
                int[] cnt = new int[N+1];
                for(int i=1; i<=N ;i++){
                    cnt[fri[i]]++;
                }
                
                int ans = 0;
                for(int i=1; i<=N ;i++){
                    ans = Math.max(ans, cnt[i]);
                }
                
                System.out.println(ans);
        }
}