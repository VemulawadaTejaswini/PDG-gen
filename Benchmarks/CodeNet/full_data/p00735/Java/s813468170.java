
import java.lang.*;
import java.util.*;
public class Main
{
    static Scanner sc = new Scanner(System.in);
        
    public static void main(String args[])
    {
        int[] p = new int[300000];
        int c=0;
        Arrays.fill(p,1);
        for(int i=2; i<300000; i++){
            if(p[i] == 1){
                if(i%7 == 1 || i%7 == 6){
                    for(int j=i*2; j<300000; j+=i){
                        p[j] = 0;
                    }
                    c++;
                   
                }else p[i] = 0;
            }
        }
        
    
        
        while( true ){
            int n = sc.nextInt();
            if(n==1) break;
             System.out.print(n+": ");    

            for(int i=2; i<300000; i++){
                if(p[i] == 1 && n%i==0)System.out.print(i+" ");
                
            }
             System.out.println();    
             
        }
    }   
}


	    