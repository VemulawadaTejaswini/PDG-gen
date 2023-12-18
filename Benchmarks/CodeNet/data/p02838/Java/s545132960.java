import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int mod = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int n= nextInt(sc);
        long[] a = toArray(sc.nextLine());
        long sum = 0L;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                sum += (a[i]^a[j]);
                sum = sum%mod;
            }

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