import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] a = new int[h][w];
        for (int i = 0 ; i < h ; i++) {
            for (int j = 0 ; j < w ; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        List<Integer> y1 = new ArrayList<>();
        List<Integer> x1 = new ArrayList<>();
        List<Integer> y2 = new ArrayList<>();
        List<Integer> x2 = new ArrayList<>();
        int n = 0;
        for (int i = 0 ; i < h ; i ++) {
            for (int j = 0 ; j < w - 1; j++) {
                if (a[i][j] % 2 != 0) {
                    a[i][j]--;
                    a[i][j + 1]++;
                    y1.add(i + 1);
                    x1.add(j + 1);
                    y2.add(i + 1);
                    x2.add(j + 2);
                    n++;
                }
            }
        }

        for (int i = 0 ; i < h - 1; i++) {
            if (a[i][w - 1] % 2 != 0) {
                a[i][w - 1]--;
                a[i + 1][w- 1]++;
                y1.add(i + 1);
                x1.add(w);
                y2.add(i + 2);
                x2.add(w);
                n++;
            }
        }
        System.out.println(n);
        for (int i = 0 ; i < n ; i++) {
            System.out.println(y1.get(i) + " " + x1.get(i) + " "  + y2.get(i) + " "  + x2.get(i));
        }
    }
}