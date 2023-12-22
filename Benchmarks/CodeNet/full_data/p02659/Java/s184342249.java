import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        long a,c;
        double b;
        Scanner in=new Scanner(System.in);
        a=in.nextLong();
        b=in.nextDouble();
        c= (long) (b*100);
        a*=c;
        a/=100;
        System.out.println(a);

    }
}
