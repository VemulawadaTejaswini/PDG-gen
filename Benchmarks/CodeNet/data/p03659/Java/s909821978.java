import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        Long[] a = new Long[N];
        long t = 0;
        for(int i=0; i < N; i++){
            a[i] = Long.parseLong(sc.next());
            
            t+=a[i];
        }
        
        Arrays.sort(a);
        long x = 0;
        long y = 0;
        
        for(int i=0; i < N; i++){
            
            if(x+a[i] <= (t/2) ) x += a[i];
            else y += a[i];
            
        }

        
     

        System.out.print( Math.abs(x-y) );

        System.out.println();
    }

}