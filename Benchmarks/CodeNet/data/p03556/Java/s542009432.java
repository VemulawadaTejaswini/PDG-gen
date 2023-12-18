import java.util.*;
import java.lang.*;
 
 //O(100000000)
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        int r = 0;
        int max = 0;
        
        for(int i=0; i < N ; i ++ ){
           // max = Math.max( max, i*i);
            if( i*i > max && i*i < N ){
                r = i*i;
                max = r;
            }
            
        }
    
        System.out.print(r);
        System.out.println();
    }

}

