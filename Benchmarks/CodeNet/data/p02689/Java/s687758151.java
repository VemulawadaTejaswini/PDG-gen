import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int M = scan.nextInt();
                int[] H = new int[N+1];
                int[] MaxA = new int[N+1];

                for(int i=1; i<=N;i++){
                    H[i] = scan.nextInt();
                    MaxA[i] = 0;
                }

                for(int i=1; i<=M;i++){
                    int a = scan.nextInt();
                    int b = scan.nextInt();
                    
                    MaxA[a] = Math.max(MaxA[a], H[b]);
                    MaxA[b] = Math.max(MaxA[b], H[a]);
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
