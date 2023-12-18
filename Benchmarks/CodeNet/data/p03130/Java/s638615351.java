import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int[] count = new int[4];
            for (int i = 0; i < 3; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                count[a]++;
                count[b]++;
            }
            int max = 0;
            for (int i = 0; i < count.length; i++) {
                max = Math.max(max, count[i]);
            }
            System.out.println(max <= 2 ? "YES" : "NO");
        }
    }
}
