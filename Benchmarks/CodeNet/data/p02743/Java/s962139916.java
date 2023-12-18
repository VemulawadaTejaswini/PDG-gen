import java.math.BigInteger;
import java.util.*;

public class Main {

    static final int MOD=1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long temp1 = a*a+b*b;
        long temp2 = -(c*c-2*(a*b+a*c+b*c));
        System.out.println(temp2<temp1?"Yes":"No");


    }
}
