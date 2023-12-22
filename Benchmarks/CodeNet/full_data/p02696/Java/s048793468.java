import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int A = scan.nextInt();
                int B = scan.nextInt();
                int N = scan.nextInt();
                
                int k=0;
                int l=0;
                
                int ans = 0;
                int preans = 0;

                     k = (A*(B-1))/B;

                     ans = k;
                     
                     k = (A*N)/B;
                     l = (N/B);
                     
                     preans = k - A*l;
                     System.out.println(Math.min(ans,preans));
        }
}