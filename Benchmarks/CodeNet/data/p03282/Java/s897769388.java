import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        String K = scan.next();
        BigInteger remain = new BigInteger(K);
        char[] data = S.toCharArray();
        if (data.length == 1) {
            System.out.println(data[0]);
            return;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] == '1') {
                if (remain.compareTo(BigInteger.ONE) == 0) {
                    System.out.println(data[i]);
                    return;
                }
                remain = remain.subtract(BigInteger.ONE);
            } else {
                System.out.println(data[i]);
                return;
            }
        }
    }
}
