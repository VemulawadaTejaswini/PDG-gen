import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.next());
        int m = Integer.parseInt(s.next());

        double[] height = new double[n];
        boolean[] good = new boolean[n];
        Arrays.fill(good, true);

        for (int i = 0; i < n; i++) {
            height[i] = Double.parseDouble(s.next());
        }

        boolean[][] root = new boolean[n][n];
        for(int j = 0; j < n; j++) Arrays.fill(root[j], false);

        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(s.next());
            int b = Integer.parseInt(s.next());
            root[a-1][b-1] = true;
            root[b-1][a-1] = true;
        }

        for (int k = 0; k < n; k++) {
            for(int k2 = 0; k2 < n; k2++) {
                if((height[k] <= height[k2]) && root[k][k2]) {
                    good[k] = false;
                    break;
                }
            }
        }

        int count = 0;

        for(int i = 0; i < n; i++) {
            if(good[i]) count++;
        }

        System.out.println(count);
    }
}