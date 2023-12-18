import java.util.*;

public class Main{

     public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        long N=sc.nextLong();
        long[] ABCDE= new long[5];
        
        long[] abcdeE= new long[6];
        for(int i=0; i<5;i++){
            ABCDE[i]=sc.nextLong();
            abcdeE[i]=0;
        }
        int minute=0;
        abcdeE[0]=N;
        abcdeE[5]=0;
        
        while(abcdeE[5]!=N){
            for(int i=4;i>=0;i--){
                
                if(abcdeE[i]<ABCDE[i]){
                    abcdeE[i+1]+=abcdeE[i];
                    abcdeE[i]=0;
                
                    
                }else{
                    abcdeE[i+1]+=ABCDE[i];
                    abcdeE[i]-=ABCDE[i];
                }
                
            }
            minute++;
        }
        System.out.println(minute);
        
        
     }
}