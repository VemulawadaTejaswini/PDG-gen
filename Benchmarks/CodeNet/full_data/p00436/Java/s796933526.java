import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt() * 2;
        int[] l = IntStream.rangeClosed(1, k).toArray();
        int m = sc.nextInt();
        while (m-- > 0) {
            int n = sc.nextInt();
            int[] t = new int[k];
            if (n == 0) {
                for (int i = 0; i < k; i++) {
                    t[i] = l[(i % 2 == 0 ? i : k + i) / 2];
                }
            } else {
                for (int i = 0; i < k; i++) {
                    t[i] = l[(i + n) % k];
                }
            }
            l = t;
        }
        for (int i : l) {
            System.out.println(i);
        }
    }
}

