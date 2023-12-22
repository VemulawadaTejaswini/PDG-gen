import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static final BigInteger MAX_VALUE = new BigInteger("1000000000000000000") ;

    public static BigInteger solve(BigInteger [] arr) {
        BigInteger result = BigInteger.ONE;
        for (BigInteger value : arr) {

            result = value.multiply(result);
            if (result.compareTo(MAX_VALUE) > 0) return new BigInteger("-1");
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int n = sn.nextInt();
        BigInteger [] arr = new BigInteger[n];
        for(int i = 0; i<n ; i++) {
            arr[i] = new BigInteger(sn.next());
            if(arr[i].compareTo(BigInteger.ZERO) == 0) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(solve(arr).toString());
    }
}