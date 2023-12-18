import java.util.*;
import java.lang.*;
 
 //O(100000000)
public class Main {
    public static void main(String[] args) {
 
        Scanner sc  = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        
        long n  =  length(N);

        if(N%n==0)System.out.print("Yes");
        else  System.out.print("No");
        
        //System.out.print();
        System.out.println();
    }
    
    public static final int length(long value) {
    int cnt = 0;
    do {
        cnt++;
        value /= 10;
    } while (value != 0);
    return cnt;
}
 
}