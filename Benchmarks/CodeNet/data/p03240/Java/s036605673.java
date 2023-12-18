import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }
        for (int i = 0; i <= 100; i++) {
            int index = -1;
            for (int j = 0; j <= 100; j++) {
                int count = 0;
                for (int k = 0; k < n; k++) {
                    if (h[k] != 0)
                        index = k;
                }
                int hight = Math.abs(x[index] - i) + Math.abs(y[index] - j) + h[index];
                for (int k = 0; k < n; k++) {
                    if (h[k] == 0)
                        count++;
                    else if (Math.abs(x[k] - i) + Math.abs(y[k] - j) + h[k] == hight)
                        count++;
                    else
                        ;
                }
                if (count == n) {
                    System.out.println(i + " " + j + " " + hight);
                    System.exit(0);
                }
            }
        }
    }
}
