import java.util.*;
import java.awt.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[m];
        int[] y = new int[m];
        int[][] cop = new int[2][m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
            y[i] = sc.nextInt();
            cop[0][i] = p[i];
            cop[1][i] = y[i];
        }

        Arrays.sort(cop, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });

        int[] count = new int[n];
        int[] num = new int[1000000001];

        for (int i = 0; i < m; i++) {
            num[cop[1][i]-1] = ++count[cop[0][i]-1];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5 - p[i]/10; j++) {
                System.out.print("0");
            }
            System.out.print(p[i]);
            for (int j = 0; j < 5 - (num[y[i]-1]1)/10; j++) {
                System.out.print("0");
            }
            System.out.print(num[y[i]-1]);
            System.out.println(" ");
        }

    }
}
