import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        l: for (int i = 0; i <= 1e9; i++) {
            int[] m = new int[n];
            m[0] = i;
            for (int j = 1; j < n; j++) {
                m[j] = 2 * a[j - 1] - m[j - 1];
                if (m[j] < 0) {
                    continue l;
                }
            }
            if (m[0] == 2 * a[n - 1] - m[n - 1]) {
                System.out.println(IntStream.of(m).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
                break;
            }
        }
    }
}
