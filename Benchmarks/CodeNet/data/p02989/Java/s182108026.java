import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] d = new int[N];
            for (int i = 0; i < N; i++) {
                d[i] = in.nextInt();
            }

            Arrays.sort(d);

            int d1 = d[N / 2 - 1];
            int d2 = d[N / 2];

            System.out.println(d2 - d1);
        }
    }
}
