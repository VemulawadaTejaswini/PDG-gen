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
                
                long ans = 0;
                long preans = 0;

                     k = (A*(B-1))/B;
                     l = (B-1/B);

                     ans = k;
                     
                     k = (A*N)/B;
                     l = (N/B);
                     
                     preans = k - A*l;
                     System.out.println(Math.max(ans,preans));
        }
}