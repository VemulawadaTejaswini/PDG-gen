
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[][] ans = new long[n][8];
        List<Cake> xlist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Cake c = new Cake();
            c.x = sc.nextLong();
            c.y = sc.nextLong();
            c.z = sc.nextLong();
            xlist.add(c);
        }
        for (int i = 0; i < n; i++) {
            ans[i][0] = xlist.get(i).x + xlist.get(i).y + xlist.get(i).z;
            ans[i][1] = -xlist.get(i).x + xlist.get(i).y + xlist.get(i).z;
            ans[i][2] = xlist.get(i).x - xlist.get(i).y + xlist.get(i).z;
            ans[i][3] = -xlist.get(i).x - xlist.get(i).y + xlist.get(i).z;
            ans[i][4] = xlist.get(i).x + xlist.get(i).y - xlist.get(i).z;
            ans[i][5] = -xlist.get(i).x + xlist.get(i).y - xlist.get(i).z;
            ans[i][6] = xlist.get(i).x - xlist.get(i).y - xlist.get(i).z;
            ans[i][7] = -xlist.get(i).x - xlist.get(i).y - xlist.get(i).z;
        }
        long[] A = new long[8];
        Arrays.sort(ans, (a, b) -> Long.compare(a[0], b[0]));
        for (int i = 0; i < m; i++) {
            A[0] += ans[n - 1 - i][0];
        }
        Arrays.sort(ans, (a, b) -> Long.compare(a[1], b[1]));
        for (int i = 0; i < m; i++) {
            A[1] += ans[n - 1 - i][1];
        }
        Arrays.sort(ans, (a, b) -> Long.compare(a[2], b[2]));
        for (int i = 0; i < m; i++) {
            A[2] += ans[n - 1 - i][2];
        }
        Arrays.sort(ans, (a, b) -> Long.compare(a[3], b[3]));
        for (int i = 0; i < m; i++) {
            A[3] += ans[n - 1 - i][3];
        }
        Arrays.sort(ans, (a, b) -> Long.compare(a[4], b[4]));
        for (int i = 0; i < m; i++) {
            A[4] += ans[n - 1 - i][4];
        }
        Arrays.sort(ans, (a, b) -> Long.compare(a[5], b[5]));
        for (int i = 0; i < m; i++) {
            A[5] += ans[n - 1 - i][5];
        }
        Arrays.sort(ans, (a, b) -> Long.compare(a[6], b[6]));
        for (int i = 0; i < m; i++) {
            A[6] += ans[n - 1 - i][6];
        }
        Arrays.sort(ans, (a, b) -> Long.compare(a[7], b[7]));
        for (int i = 0; i < m; i++) {
            A[7] += ans[n - 1 - i][7];
        }

        Arrays.sort(A);
        System.out.println(A[7]);
    }

    static class Cake {
        long x;
        long y;
        long z;
    }
}
