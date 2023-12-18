import java.util.*;
import java.util.stream.Collectors;

public class Main {

    Scanner in = new Scanner(System.in);

    void solve() {
        int h = in.nextInt(), w = in.nextInt(), d = in.nextInt();
        int[][] field = new int[h+1][w+1];
        int[] fx = new int[h * w + 1], fy = new int[h * w + 1];
        for(int i = 1; i <= h; i++) {
            for(int j = 1; j <= w; j++) {
                int a = in.nextInt();
                field[i][j] = a;
                fx[a] = i;
                fy[a] = j;
            }
        }

        int q = in.nextInt();
        for(int i = 0; i < q; i++) {
            int l = in.nextInt(), r = in.nextInt();
            if(l == r){
                System.out.println(0);
            }else {
                int ans = 0;
                while(l != r) {
                    int nx = fx[l + d], ny = fy[l + d];
                    ans += Math.abs(fx[l] - nx) + Math.abs(fy[l] - ny);
                    l += d;
                }
                System.out.println(ans);
            }
        }
    }
    public static void main(String[] args) {
        new Main().solve();
    }
}