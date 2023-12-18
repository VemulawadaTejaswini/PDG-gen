import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int h = sc.nextInt(), w = sc.nextInt();
        int[][] a = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        List<Ans> ans = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (a[i][j] % 2 != 0) {
                    if (j + 1 < w) {
                        a[i][j]--;
                        a[i][j + 1]++;
                        Ans aa = new Ans();
                        aa.y = i + 1;
                        aa.x = j + 1;
                        aa.yy = i + 1;
                        aa.xx = j + 2;
                        ans.add(aa);
                    } else if (i + 1 < h) {
                        a[i][j]--;
                        a[i + 1][j]++;
                        Ans aa = new Ans();
                        aa.y = i + 1;
                        aa.x = j + 1;
                        aa.yy = i + 2;
                        aa.xx = j + 1;
                        ans.add(aa);
                    }
                }
            }
        }
        System.out.println(ans.size());
        for (Ans aa : ans) {
            System.out.println(aa.toString());
        }
    }

    class Ans {

        int y, x, yy, xx;

        public String toString() {
            return y + " " + x + " " + yy + " " + xx;
        }
    }
}