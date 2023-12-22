import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                long A = scan.nextLong();
                long B = scan.nextLong();
                long N = scan.nextLong();
                
                long k=0;
                long l=0;
                
                long ans = -1;
                long preans = 0;
                
                long prean = 0;
                long xans = 0;
 
                for(long x=N/2; x<=N; x++ ){
                     k = (A*x)/B;
                     l = (x/B);
                     
                     preans = ans;
                     ans = k - A*l;
                     
                     if(preans>ans){
                         System.out.println(prean);
                     }
                }     
                 System.out.println(ans);
        }
}
