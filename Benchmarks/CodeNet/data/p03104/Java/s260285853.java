import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        Mynum a = new Mynum(A-1);
        Mynum b = new Mynum(B);
        long r = Mynum.calc(a, b);
        System.out.println(r);
   }

   static class Mynum {
        final static int keta = 50;
        long[] val = new long[keta];
        Mynum(long init_param) {
            init_param++;
            for(int i=0; i<keta; i++) {
                long pivot = 2L << i;
                long divisor = pivot / 2;
                val[i] = (init_param / pivot) * divisor + Math.max(0, (init_param % pivot) - divisor);
//                System.out.println(String.format("%d:%d", i, val[i]));
            }

        }

        static long calc(Mynum A, Mynum B) {
            long r = 0L;
            for(int i=0; i<keta; i++) {
                long f = (B.val[i] - A.val[i]) % 2L;
                r+=f * ((2L << i) / 2L);
            }
            return r;
        }
   }
}