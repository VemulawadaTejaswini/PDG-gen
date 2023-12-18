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
               
                for(int x=0; x<=N; x = x+3 ){
                     k = (A*x)/B;
                     l = (x/B);
                     
                     preans = ans;
                     ans = k - A*l;
                     
                     if(preans>ans){
                         prean = preans;
                         xans = x;
                         break;
                     }
                     prean = ans;
                     xans = x;
                }                  
                
                for(long x= xans - 6; x<= xans ; x++){
                     k = (A*x)/B;
                     l = (x/B);
                     
                     preans = ans;
                     ans = k - A*l;
                     
                     if(preans>ans){
                         System.out.println(preans);
                         System.exit(0);
                     }
                }
                System.out.println(ans);
        }
}