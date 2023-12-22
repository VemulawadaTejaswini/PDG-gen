import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int[] A = new int[N];
                
                long ans = 0;
                
                long min = 1000000000;
                for(int i=0; i<N;i++){
                    A[i] = scan.nextInt();
                    long p = (long) A[i];
                    ans = ans + p;
                    
                    if(min>p){
                        min = p;
                    }
                }
                
                System.out.println(ans-min);
                
        }               
}