import java.util.*; 
import java.lang.*; 


public class Main{
    
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                long N = scan.nextLong();
                
                int i=0;
                long a = 1;
                while(i<N){
                    a = a*10;
                    a = a%(10*10*10*10*10*10*10*10*10+7);
                    i++;
                }
                
                int j=0;
                long b = 1;
                while(j<N){
                    b = b*9;
                    b = b%(10*10*10*10*10*10*10*10*10+7);
                    j++;
                }
                
                b = (2*b)%(10*10*10*10*10*10*10*10*10+7);
                
                int k=0;
                long c = 1;
                while(k<N){
                    c = c*8;
                    c = c%(10*10*10*10*10*10*10*10*10+7);
                    k++;
                }
                
                long ans = (a-b+c)%(10*10*10*10*10*10*10*10*10+7);
                System.out.println(ans);
        }
}