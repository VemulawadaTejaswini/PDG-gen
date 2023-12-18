
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int k = Integer.parseInt(scan.next());
        boolean[] sunuke = new boolean[n];
        Arrays.fill(sunuke, false);
        for (int i = 0; i < k; i++) {
            int d = Integer.parseInt(scan.next());
            for (int j = 0; j < d; j++) {
                int a = Integer.parseInt(scan.next());
                a--;
                sunuke[a] = true;
            }
        }
        scan.close();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (!sunuke[i]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
