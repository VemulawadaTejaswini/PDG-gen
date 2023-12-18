import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = new BigInteger(sc.next());
        BigInteger B = new BigInteger(sc.next());
        sc.close();

        BigInteger C = A.gcd(B);
        int cnt = 1;

        if (C.longValue()%2==0)
            cnt++;

        for (long i=3; i<C.longValue(); i+=2) {
            if (C.longValue()%i==0) {
                boolean b = true;
                for (long j=3; j<Math.sqrt((double)i); j++) {
                    if (i%j==0) {
                        b = false;
                        break;
                    }
                }
                if (b)
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}