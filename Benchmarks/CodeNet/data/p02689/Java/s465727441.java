import java.lang.reflect.Array;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // height: index
        int n = scan.nextInt();
        int[] hs = new int[n];
        boolean[] hasNei = new boolean[n];
        Arrays.fill(hasNei, false);
        boolean[] isBad = new boolean[n];
        Arrays.fill(isBad, false);
        int nEdge = scan.nextInt();
        for (int i = 0; i < n; i++) {
            hs[i] = scan.nextInt();
        }
        for (int i = 0; i < nEdge; i++) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            hasNei[l - 1] = true;
            hasNei[r - 1] = true;
            if (hs[l - 1] >= hs[r - 1]) {
                isBad[r - 1] = true;
            }
            if (hs[l - 1] <= hs[r - 1]) {
                isBad[l - 1] = true;
            }

        }
        scan.close();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (!hasNei[i]) {
                cnt++;
                continue;
            }

            if (!isBad[i]) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}



