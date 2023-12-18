import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println(solve(N, a));
    }
    public static String solve(int N, int[] a) {
        if (a[0] > 0) {
            return "-1";
        }
        BigInteger answer = BigInteger.ZERO;
        for (int i = 1; i < N; i++) {
            if (a[i-1]+1 < a[i]) {
                return "-1";
            }
            if (a[i-1]+1 == a[i]) {
                answer = answer.add(BigInteger.ONE);
                continue;
            }
            answer = answer.add(new BigInteger(Integer.toString(a[i])));
        }
        return answer.toString(10);
    }
}
