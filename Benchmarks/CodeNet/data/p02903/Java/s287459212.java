import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int H = Integer.parseInt(sc.next());
        final int W = Integer.parseInt(sc.next());
        final int A = Integer.parseInt(sc.next());
        final int B = Integer.parseInt(sc.next());
        sc.close();

        int bit[][] = new int[H][W];
        int h = 0;
        int w = 0;
        for (h=0; h<H; h++) {
            int cnt = 0;
            while (cnt<A) {
                if (w>=W) w-=W;
                bit[h][w] = 1;
                cnt++;
                w++;
            }
        }

        for (w=0; w<W; w++) {
            int sum = 0;
            for (h=0; h<H; h++) {
                sum += bit[h][w];
            }
            sum = Math.min(sum, H-sum);
            if (2*sum>H) {
                System.out.println("No");
                return;
            }
        }

        PrintWriter pw = new PrintWriter(System.out);
        for (h=0; h<H; h++) {
            for (w=0; w<W; w++) {
                pw.print(bit[h][w]);
            }
            pw.println("");
        }
        pw.flush();
    }
}