
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();

        long max = 1;
        long p = 2;
        final double logx = Math.log(x);
        while(true){

            long b = (long)(logx / Math.log((double)p));
            if(b<2) break;
            long bp = (long)Math.pow(p,b);
            if(bp>max) max = bp;
            p++;
        }

        System.out.println(max);
    }
}