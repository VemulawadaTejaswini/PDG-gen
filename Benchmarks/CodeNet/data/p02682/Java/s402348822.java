import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int A = scan.nextInt();
                int B = scan.nextInt();
                int C = scan.nextInt();
                int K = scan.nextInt();
                
                int ans = 0;
                int mai = K;
                while(mai>0){
                    for(int i=A;i>0;i--){
                        ans = ans+1;
                        mai--;
                        if(mai<=0){
                             System.out.println(ans);
                             System.exit(0);
                        }
                    }
                    for(int i=B;i>0;i--){
                        mai--;
                        if(mai<=0){
                             System.out.println(ans);
                             System.exit(0);
                        }
                    }
                    for(int i=C;i>0;i--){
                        ans = ans-1;
                        mai--;
                        if(mai<=0){
                             System.out.println(ans);
                             System.exit(0);
                        }
                    }
                }
               
        }
}