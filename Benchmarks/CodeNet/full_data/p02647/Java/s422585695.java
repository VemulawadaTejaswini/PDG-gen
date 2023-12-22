import java.io.BufferedInputStream;
import java.util.Scanner;

public class ProblemC {

    public static int round(int x, int y) {
        if (x < 0) return 0;
        else if (x >= y) return y;
        else return x;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedInputStream(System.in));
        int n = input.nextInt();
        int k = input.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = input.nextInt();
        }
        for (int i = 0; i < k; i++) {
            int[] buckets = new int[n];
            for (int p = 0; p < n; p++) {
                int thing = l[p];
                for (int j = round(p - thing, n); j < round(p + thing + 1, n); j++) {
                    buckets[j]++;
                }
            }
            for (int j = 0; j < n; j++) {
                l[j] = buckets[j];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(l[i] + " ");
        }
        System.out.println();
    }
}
