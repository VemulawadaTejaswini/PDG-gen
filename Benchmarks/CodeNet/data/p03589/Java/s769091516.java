import java.util.*;
import java.lang.*;
 
 //O(100000000)
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int cnt = 0;

        long N = Long.parseLong(sc.next());
        long h = 1;
        long n = 2;
        long w = 1;
        
        while(true){
            
            if(4==N*(1+1+1/w))break;
            w++;
        }
        
        
        System.out.print(h+" "+n+" "+w);
        System.out.println();

    }

}