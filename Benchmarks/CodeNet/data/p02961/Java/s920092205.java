
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt(), y = sc.nextInt();
        int length = Math.abs(x) + Math.abs(y);

        ArrayList<P> ans = new ArrayList<>();

        P cp = new P(0, 0);
        P gp = new P(x, y);

        int d = 0;

        while (gp.dist(cp) > k) {
            addAns(k, ans, cp, gp);
            d++;
        }

        if (length % 2 == k % 2) {
            if (gp.dist(cp) == k) {
                addAns(k, ans, cp, gp);
            } else {
                if (k % 2 == 0) {
                    int r = cp.dist(gp);
                    int nx = gp.x + r / 2;
                    int ny = (gp.y > 0 ? -1 : 1) * (k - r / 2 - 1);
                    ans.add(new P(nx, ny));
                    ans.add(gp);
                } else {
                    int r = cp.dist(gp);
                    if (r % 2 == 1) {
                        int nx = (gp.x > 0 ? -1 : 1) * k;
                        cp.x += nx;
                        ans.add(new P(cp.x, cp.y));
                    }
                    int dx = Math.abs(cp.x - gp.x), dy = Math.abs(cp.y - gp.y);
                    r = cp.dist(gp);

                    int nx = gp.x + (gp.x > 0 ? 1 : -1) * r / 2;
                    int ny = (gp.y > 0 ? -1 : 1) * (k - r / 2 - 1);
                    ans.add(new P(nx, ny));
                    ans.add(gp);
                }
            }
            int size = ans.size();
            System.out.println(size);
            for (P p: ans) {
                System.out.println(p.x + " " + p.y);
            }
        } else {
            System.out.println(-1);
        }
    }

    private void addAns(int k, ArrayList<P> ans, P cp, P gp) {
        int ax = Math.min(k, Math.abs(cp.x - gp.x) - 1);
        cp.x += (gp.x > 0 ? 1 : -1) * ax;
        cp.y += (gp.y > 0 ? 1 : -1) * (k - ax);
        ans.add(new P(cp.x, cp.y));
    }

    class P {
        int x, y;

        P(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int dist(P p) {
            return Math.abs(x - p.x) + Math.abs(y - p.y);
        }
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
