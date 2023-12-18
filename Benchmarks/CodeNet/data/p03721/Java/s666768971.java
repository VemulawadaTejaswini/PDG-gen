 import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc  = new Scanner(System.in);
 
        long N = Long.parseLong(sc.next());
        float K = Float.parseFloat(sc.next());
        
        long a = 0;
        float cnt = 0;
 
        for(long i=0;i<N;i++){
            a     = Long.parseLong(sc.next());
            cnt  += Long.parseLong(sc.next());
            
            if(cnt/100000 >= K/100000) {
                System.out.print(a);
                break;   
            }
            
        }
 
 
        System.out.println();
    }
 
}