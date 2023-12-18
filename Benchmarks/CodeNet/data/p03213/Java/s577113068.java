import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        List<Integer> prime = prime(N);
        int[] divisor = new int[N+1];
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= N; i++) {
            factorial = factorial.multiply(new BigInteger(Integer.toString(i)));
        }
        for (int p : prime) {
            BigInteger current = factorial;
            BigInteger d = new BigInteger(Integer.toString(p));
            while(current.mod(d).compareTo(BigInteger.ZERO) == 0) {
                divisor[p] += 1;
                current = current.divide(d);
            }
        }
        Arrays.sort(divisor);
        int more_than_equal_2 = 0;
        int more_than_equal_4 = 0;
        int more_than_equal_14 = 0;
        int more_than_equal_24 = 0;
        int more_than_equal_74 = 0;
        for (int i = 1; i < N+1; i++) {
            if (2 <= divisor[i]) {
                more_than_equal_2 += 1;
            }
            if (4 <= divisor[i]) {
                more_than_equal_4 += 1;
            }
            if (14 <= divisor[i]) {
                more_than_equal_14 += 1;
            }
            if (24 <= divisor[i]) {
                more_than_equal_24 += 1;
            }
            if (74 <= divisor[i]) {
                more_than_equal_74 += 1;
            }
        }
        long answer = 0;
        if (3 <= more_than_equal_4) {
            answer += more_than_equal_4 * (more_than_equal_4-1) * (more_than_equal_4-2) / 2;
        }
        if (3 <= more_than_equal_2 && 2 <= more_than_equal_4) {
            answer += (more_than_equal_2 - more_than_equal_4) * more_than_equal_4 * (more_than_equal_4 - 1) / 2;
        }
        if (2 <= more_than_equal_24) {
            answer += more_than_equal_24 * (more_than_equal_24 - 1);
        }
        if (1 <= more_than_equal_24 && 2 <= more_than_equal_2) {
            answer += (more_than_equal_2-more_than_equal_24)*more_than_equal_24;
        }
        if (2 <= more_than_equal_14) {
            answer += more_than_equal_14 * (more_than_equal_14 - 1);
        }
        if (1 <= more_than_equal_14 && 2 <= more_than_equal_4) {
            answer += (more_than_equal_4-more_than_equal_14)*more_than_equal_14;
        }
        if (1 <= more_than_equal_74) {
            answer += more_than_equal_74;
        }
        System.out.println(answer);
    }
    private List<Integer> prime(int N) {
        boolean[] d = new boolean[N+1];
        List<Integer> prime = new ArrayList<>();
        int i = 2;
        for (; i * i <= N; i++) {
            if (!d[i]) {
                prime.add(i);
            }
            for (int j = 2; j * i <= N; j++) {
                d[i * j] = true;
            }
        }
        for (; i <= N; i++) {
            if (!d[i]) {
                prime.add(i);
            }
        }
        return prime;
    }
}
