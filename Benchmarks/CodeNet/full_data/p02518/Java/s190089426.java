import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);

        while(true){
            int n = s.nextInt();
            int nn = n * (n + 1) / 2;

            if(n == 0) break;

            BigInteger [] v = new BigInteger[nn];

            for(int i = 0; i < nn; i++){
                v[i] = s.nextBigInteger();
            }

            BigInteger a1a1 = v[0].multiply(v[1]).divide(v[n]);

            double maybe = Math.sqrt(a1a1.doubleValue());

            BigInteger maybeA = new BigInteger(Long.toString(((long)(maybe - 10))));
            maybeA = maybeA.max(BigInteger.ZERO);

            while(!maybeA.multiply(maybeA).equals(a1a1)){
                maybeA = maybeA.add(BigInteger.ONE);
            }

            long a = maybeA.intValue();

            System.out.println(Long.toString(a));

            for(int i = 0; i < n; i++){
                System.out.print(Long.toString(v[i].longValue() / a));
                if(i == n - 1) System.out.println("");
                else System.out.print(" ");
            }
        }
    }
}