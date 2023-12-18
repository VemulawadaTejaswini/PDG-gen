import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int color[] = {400, 800, 1200, 1600, 2000, 2400, 2800, 3200, Integer.MAX_VALUE};
        int count[] = new int[color.length];
        Arrays.fill(count, 0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < color.length; j++) {
                if (a[i] < color[j]) {
                    count[j]++;
                    break;
                }
            }
        }

        int c = 0;
        for (int i = 0; i < count.length - 1; i++) {
            if (count[i] != 0) {
                c++;
            }
        }

        int mn = Math.max(1, c);
        int mx = c + count[count.length - 1];

        System.out.println(mn + " " + mx);
        
    }
}
