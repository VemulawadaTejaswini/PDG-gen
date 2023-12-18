import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final int MOD = 1_000_000_007;
    public static void main(String[] args) {
        System.setIn(Main.class.getResourceAsStream("input"));
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int n= nextInt(sc);
        long[] a = toArray(sc.nextLine());
        long[] count = new long[60];
        for (int j = 0; j < count.length ; j++) {
            for (int i = 0; i < n; i++) {
                long res = (a[i] >> j) & 1;
                if(res == 1) count[j]++;
            }
        }
        long sum = 0L;
        long prod = 1L;
        for (int i = 0; i < count.length; i++) {
            sum = ( (sum%MOD) + ((count[i]*(n-count[i]))%MOD) * (prod%MOD) )%MOD ;
            prod*=2;
        }

        System.out.println(sum);
    }

    private static int nextInt(Scanner sc) {
        return Integer.valueOf(sc.nextLine());
    }
    private static long[] toArray(String text) {
        return Arrays.stream(text.split(" ")).mapToLong(Long::valueOf).toArray();
    }
}