import java.util.*; 
import java.lang.*; 


public class Main{
    
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int S = scan.nextInt();
                
                long[] all = new long[S+1];
                
                for(int i=1; i<=S; i++){
                    if(i<=2){
                        all[i] = 0;
                    }else if( i== 3 ){
                        all[i] = 1;
                    }else{
                        all[i] = all[i-1]+all[i-3];
                        all[i] %= (10*10*10*10*10*10*10*10*10+7);
                    }
                }
                
                System.out.println(all[S]);

        }
}