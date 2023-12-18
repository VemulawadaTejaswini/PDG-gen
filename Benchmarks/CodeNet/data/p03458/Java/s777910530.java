import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String[] s = in.nextLine().split(" ");
        int k = new Integer(s[1]);
        int n = new Integer(s[0]);
        int[][] point = new int[n][3];
        for (int num = 0; num < n; num++) {
            String[] d = in.nextLine().split(" ");
            point[num][0] = new Integer(d[0]);
            point[num][1] = new Integer(d[1]);
            point[num][2] = (d[2].equals("B")) ? 1 : 0;

        }

        int maxS = 0, minx, xx, yy, count, miny, mod;
        for (int i = 0; i < k; i++) {
            minx = k;
            for (int j = 0; j < k; j++) {
                count = 0;
                miny = k;
                for (int[] p : point) {
                    xx = p[0] - i + k;
                    yy = p[1] - j + k;
                    mod = xx % k;
                    if (mod < minx)
                        minx = mod;
                    if (k - mod - 1 < minx)
                        minx = k - mod - 1;

                    mod = yy % k;
                    if (mod < miny)
                        miny = mod;
                    if (k - mod - 1 < miny)
                        miny = k - mod - 1;
                    if (((xx / k + yy / k) & 1) == p[2]) {
                        count++;
                    }
                }
                if (count > maxS)
                    maxS = count;
                if (n - count > maxS)
                    maxS = n - count;
                if (maxS == n) {
                    System.out.println(n);
                    return;
                }
                j += miny;
            }
            i += minx;
        }
        System.out.println(maxS);
    }
}