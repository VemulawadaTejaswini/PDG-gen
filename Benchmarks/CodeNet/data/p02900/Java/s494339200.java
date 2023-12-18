import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        long A = scan.nextLong();
        long B = scan.nextLong();

        if(A > B) {
            long tmp = A;
            A = B;
            B = tmp;
        }
        long gcd = gcd(A, B);
        if(gcd == 1) {
            os.println("1");
        } else {
            long x = gcd;
            long previ = 0;
            long answer = 1;
            for (long i = 2 ; i <= gcd; ) {
                if (x % i == 0) { // 最小の因数を求める
                    if(previ != i) {
                        answer++;
                        previ = i;
                    }
                    x /= i; // 最小の因数で割った数を代入する
                    if(x == 1)
                        break;
                } else if(i > 2) {
                    i += 2;
                } else
                    i++;
            }
            os.println(answer);
        }

    }



    static public long gcd(long a, long b) {
        while(a > 0) {
            long tmpa = a;
            a = b % a;
            b = tmpa;
        }
        return b;
    }

}