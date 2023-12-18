import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        BigInteger x[] = new BigInteger[N];
        BigInteger y[] = new BigInteger[N];
        for (int i=0; i<N; i++) {
            x[i] = new BigInteger(sc.next());
            y[i] = new BigInteger(sc.next());
        }
        sc.close();

        double sum = 0.0;
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (j==i)
                    continue;
                sum += Math.pow(Math.pow(x[i].intValue()-x[j].intValue(), 2)+Math.pow(y[i].intValue()-y[j].intValue(),2), 0.5);
            }
        }
        System.out.println(sum/N);
    }
}