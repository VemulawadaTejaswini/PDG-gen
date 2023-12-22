import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] A = new String[N];

        BigInteger result = BigInteger.ONE;

        for(int i=0; i<N; i++) {
            A[i] = sc.next();
            if(A[i].equals("0")) {
                result = BigInteger.ZERO;
            }
        }

        for(int i=0; i<N; i++) {
            String inputStr = A[i];
            BigInteger inputNum = new BigInteger(inputStr);

            result = result.multiply(inputNum);

            if(result.equals(BigInteger.ZERO)) {
                break;
            }

            if(result.compareTo(BigInteger.TEN.pow(18)) > 0) {
                result = new BigInteger("-1");
                break;
            }
        }

        System.out.println(result);
    }
}