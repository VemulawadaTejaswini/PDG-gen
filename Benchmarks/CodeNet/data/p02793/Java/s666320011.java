import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    BigInteger MOD = new BigInteger("1000000007");
    BigInteger ZERO = new BigInteger("0");

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] A = new String[N];

        BigInteger LCM = new BigInteger("1");
        for (int i = 0; i < N; i++) {
            String in = scanner.next();
            BigInteger temp = new BigInteger(in);
            LCM = LCM.multiply(temp).divide(GCD(LCM, temp));
            A[i] = in;
        }

        int Ans = 0;
        for (int i = 0; i < N; i++) {
            Ans = ( Ans + LCM.divide(new BigInteger(A[i])).mod(MOD).intValue() ) % 1000000007;
        }

        System.out.println(Ans);
    }

    BigInteger GCD(BigInteger a, BigInteger b){
        if (b.equals(ZERO))
            return a;
        else
            return GCD(b, a.mod(b));
    }

    public static void main(String[] args){
        new Main();
    }
}
