import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        P[] red = new P[n];
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            P p = new P();
            p.x = a;
            p.y = b;
            red[i] = p;
        }

        P[] blue = new P[n];
        for (int i = 0; i < n; i++) {
            int c = in.nextInt();
            int d = in.nextInt();
            P p = new P();
            p.x = c;
            p.y = d;
            blue[i] = p;
        }

        Arrays.sort(red);
        Arrays.sort(blue);

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int maxY = -1;
            P cand = null;
            for (int j = 0; j < n; j++) {
                if (red[j].x < blue[i].x && red[j].y < blue[i].y && !red[j].paired) {
                    if (red[j].y > maxY) {
                        maxY = red[j].y;
                        cand = red[j];
                    }
                }
            }

            if (cand != null) {
                cand.paired = true;
                ans++;
            }
        }

        System.out.println(ans);
    }
}

class P implements Comparable<P> {
    int x;
    int y;
    boolean paired = false;

    @Override
    public int compareTo(P o) {
        return this.x - o.x;
    }
}