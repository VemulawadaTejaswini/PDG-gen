import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                long[] A = new long[N];
                
                for(int i=0; i<N; i++){
                    A[i] = scan.nextLong();
                }
                
                long ans = 0;
                
                for(int i=0; i<N-1; i++){
                    for(int j=i+1; j<N; j++){
                        long P = A[i]*A[j];
                        P = P%(10*10*10*10*10*10*10*10*10+7);

                        ans = ans + P;
                        
                        ans = ans%(10*10*10*10*10*10*10*10*10+7);             
                    }
                }
               
                System.out.println(ans);
        }
}