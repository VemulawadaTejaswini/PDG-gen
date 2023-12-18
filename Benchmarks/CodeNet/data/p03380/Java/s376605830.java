import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();
        }
        Arrays.sort(a);
        final int ai = a[n - 1];
        final int aj = Arrays.stream(a, 0, n - 1)
                             .mapToObj(x -> new int[] {x, (int) Math.round(Math.abs(ai / 2.0 - x))})
                             .min((p1, p2) -> p1[1] - p2[1])
                             .map(p -> p[0])
                             .orElse(-1);


        System.out.printf("%d %d\n", ai, aj);
    }
}
