import java.io.*;
import java.util.*;

public class Main {
    PrintWriter out = new PrintWriter(System.out);
    long mod = 1000000000+7;
    public static void main(String[] args) throws Exception {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        // use i-indexed here
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), d = sc.nextLong();
        long lcm = c*d/gcd(c,d);
        long mc = MultipleInRange(a,b,c);
        long md = MultipleInRange(a,b,d);
        long repeat = MultipleInRange(a,b,lcm);
        return (b-a+1)-(mc+md-repeat);
    }
    long MultipleInRange(long lo, long hi, long x){
        return hi/x-(lo-1)/x;
    }
    long gcd(long x, long y){
        // first find gcd
        if(x<y){
            long c = x;
            x = y; y = c;
        }
        while(x%y!=0){
            long c = y;
            y = x%y;
            x = c;
        }
        return y;
    }
}

