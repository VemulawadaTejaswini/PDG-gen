import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] x = new int[n];
        int[] y = new int[n];
        long[] h = new long[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextLong();
        }

        long hRel = 0;
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                boolean flag = true;
                for (int i = 0; i < n; i++) {
                    long hTmp = Math.abs(cx-x[i]) + Math.abs(cy-y[i]);
                    if (0 <= hTmp - h[i]) {
                        if (hRel != hTmp - h[i]) {
                            flag = false;
                            break;
                        }
                    } else {
                        if (h[i] != 0) {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag) {       
                    System.out.println(cx + " " + cy + " " + hRel);
                    return;
                }
            }
        }
        sc.close();
    }
}
