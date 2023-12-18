import java.util.*;
import java.lang.*;
 
 //O(100000000)
public class Main {
    public static void main(String[] args) {
 
        Scanner sc  = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long[] A = new long[(int)N];
        int c = 0;
        long min = 1000000000;
        
        for(int i=0; i<N; i++){
            A[i] = Long.parseLong(sc.next());
            min = Math.min(min , A[i]);
        }
        
        long s = 0;
        
            for(int i=0; i < N; i++){
                s += A[i]; 
            }
            
            if(s%2==0){
          
        while(true){
            
            min = min/2;
            
            if(min%2==0) c++;
            if(min%2==1) break;
            
        }
            }
      
        System.out.print(c);
        System.out.println();
    }
}