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
                    a[i][j]--;
                    boolean hit = false;
                    for (int k = i - 1; k <= i + 1; k++) {
                        if (hit) {
                            break;
                        }
                        for (int l = j - 1; l <= j + 1; l++) {
                            if (k < 0 || k >= h || k == i && l == j || l < 0 || l >= w) {
                                continue;
                            }
                            if (k == i - 1 && l == j - 1 || k == i - 1 && l == j + 1 || k == i + 1 && l == j - 1
                                || k == i + 1 && l == j + 1) {
                                continue;
                            }
                            if (a[k][l] % 2 != 0) {
                                Ans tmp = new Ans();
                                tmp.y = i + 1;
                                tmp.x = j + 1;
                                tmp.yy = k + 1;
                                tmp.xx = l + 1;
                                ans.add(tmp);
                                a[k][l]++;
                                hit = true;
                                break;
                            }
                        }
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
