import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        while (c != 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int h[] = new int[n];
            int d[] = new int[n - 1];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                h[i] = sc.nextInt();

            }
            if (n <= k) {
                System.out.println(0);
            } else {

                for (int i = 0; i < n - 1; i++) {
                    d[i] = h[i + 1] - h[i];
                    sum += d[i];
                }if(k<=2){
                d[0] = 0;
                d[d.length - 1] = 0;
                }
                Arrays.sort(d);
                for (int i = 0; i < k - 1; i++) {
                    sum -= d[d.length - 1 - i];
                }
                System.out.println(sum);

            }
            c--;
        }
    }
}