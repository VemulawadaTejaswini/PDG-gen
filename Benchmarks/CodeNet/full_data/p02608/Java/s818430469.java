import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                
                int[] c = new int[N+1];
                
                for(int i=0; i<=N; i++){
                    c[i]=0;
                }
                
                for(long x=1; x<=100; x++){
                    for(long y=1; y<=100; y++){
                        for(long z=1; z<=100; z++){
                            long n = x*x+y*y+z*z+x*y+y*z+z*x;
                            
                            if(n<=N){
                                int p = (int)n;
                                c[p]++;
                            }
                        }
                    }
                }
                for(int i=1; i<=N; i++){
                    System.out.println(c[i]);
                }
        }               
}