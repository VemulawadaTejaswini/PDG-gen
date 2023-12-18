import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                long A = scan.nextLong();
                long B = scan.nextLong();
                long N = scan.nextLong();
                
                long k;
                long u;
                long l;
                long p;
                
                long ans;
                long preans;
                
                k = (A*(B-1))/B;
                u = (B-1)/B;
                
                ans = k-A*u;
                     
                p = (A*N)/B;
                l = N/B;
                     
                preans = p - A*l;
                System.out.println(Math.min(ans,preans));
        }
}