import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if ((m | n) == 0)
                break;
            final int[] p = new int[m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    p[j] += sc.nextInt();
                }
            }
            Integer[] ord = new Integer[m];
            for (int i = 0; i < m; i++) {
                ord[i] = i;
            }
            Arrays.sort(ord, new Comparator<Integer>() {
                public int compare(Integer a, Integer b) {
                    if (p[a] != p[b])
                        return p[b] - p[a];
                    return a - b;
                }
            });
            boolean f = true;
            for (int i = 0; i < m; i++) {
                if (f)
                    f = false;
                else
                    System.out.print(" ");
                System.out.print(ord[i] + 1);
            }
            System.out.println();
        }
    }
}