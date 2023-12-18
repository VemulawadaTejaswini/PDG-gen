import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] x = new long[n];
        long[] copy = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
            copy[i] = x[i];
        }
        Arrays.sort(copy);
        long midl = copy[n / 2 - 1];
        long midh = copy[n / 2];
        for (int i = 0; i < n; i++) {
            if (x[i] <= midl) {
                System.out.println(midh);
                continue;
            }
            System.out.println(midl);
        }
    }

}
