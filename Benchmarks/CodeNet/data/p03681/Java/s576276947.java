import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        if(Math.abs(a-b)<1)
            System.out.println(bb(b,bb(a,2)));
        else if(Math.abs(a-b)<2)
            System.out.println(bb(b,bb(a,1)));
        else
            System.out.println(0);
    }
    private static long bb(long a, long b){
        for(long i=1;i<=a;i++){
            b *= i;
            b%=1000000007l;
        }
        return b;
    }
}
