import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] xA = new int[n];
        int[] yA = new int[n];
        int[] hA = new int[n];

        for (int i = 0; i < n; i++) {
            xA[i] = sc.nextInt();
            yA[i] = sc.nextInt();
            hA[i] = sc.nextInt();
        }

        for (int x = 0; x <= 100; x++) {
            for (int y = 0; y <= 100; y++) {
                int h = -1;
                for (int i = 0; i < n; i++) {
                    int tmp = hA[i] + Math.abs(xA[i] - x) + Math.abs(yA[i] - y);
                    if (h == -1) {
                        h = tmp;
                    } else if (h != tmp) {
                        break;
                    }
                    
                    if (hA[i] == 0) {
                        int dist = Math.abs(xA[i] - x) + Math.abs(yA[i] - y);
                        if (h > dist) {
                            break;
                        }
                    }
                    
                    if (i == n - 1) {
                        System.out.println(x + " " + y + " " + h);
                        System.exit(0);
                    }
                }

            }
        }
    }
}