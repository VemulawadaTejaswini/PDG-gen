import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        final long A = s.nextLong();
        final long B = s.nextLong();
        final long C = s.nextLong();
        long K = s.nextLong();

        long calcVal = 0 ;
        if (K - A > 0) {
            calcVal = A;
            K -= A;

        } else {
            calcVal = K;
            System.out.println(calcVal);
            return;
        }

        if ( K - B > 0) {
            K -= B;
        } else {
            System.out.println(calcVal);
            return;
        }

        if (K - C > 1) {
            calcVal += C * -1;
        } else {
            calcVal += K * -1;
        }
        System.out.println(calcVal);
    }
}