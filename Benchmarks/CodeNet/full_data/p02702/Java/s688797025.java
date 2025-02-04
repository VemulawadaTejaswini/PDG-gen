import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int P = 2019;
        final char[] str = in.nextLine().toCharArray();
        final int N = str.length;
        final int[] digits = new int[N];
        for (int i = 0; i < N; i++) {
            digits[i] = Character.getNumericValue(str[i]);
        }
        final int[] remainders = new int[P];
        remainders[0] = 1;
        int sum = 0;
        int shift = 1;
        long ans = 0;
        for (int pos = N - 1; pos >= 0; pos--) {
            sum = (sum + shift * digits[pos]) % P;
            ans += remainders[sum];
            remainders[sum]++;
            shift = (shift * 10) % P;
        }
        System.out.println(ans);
    }
}
