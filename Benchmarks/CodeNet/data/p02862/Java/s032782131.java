import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int X = scan.nextInt();
        int Y = scan.nextInt();
        if((2*X-Y)%3 != 0 || (2*X-Y)/3 < 0){
            os.println(0);
            return;
        }

        int B = (2*X-Y)/3;
        int A = X-2*B;
        int C = A+B;

        long mother = 1000000007;

        long invA = 1;
        for(long i = A; i > 0; i--) {
            BigInteger inv = new BigInteger(String.valueOf(i)).modInverse(BigInteger.valueOf(mother));
            long invOf2 = inv.longValue();
            invA *= invOf2;
            invA %= mother;
        }

        long invB = 1;
        for(long i = B; i > 0; i--) {
            BigInteger inv = new BigInteger(String.valueOf(i)).modInverse(BigInteger.valueOf(mother));
            long invOf2 = inv.longValue();
            invB *= invOf2;
            invB %= mother;
        }

        long facC = 1;
        for(long i = C; i > 0; i--) {
            facC *= i;
            facC %= mother;
        }

        long answer = (((invA * invB) % mother) * facC) % mother;
        os.println(answer);
    }
}