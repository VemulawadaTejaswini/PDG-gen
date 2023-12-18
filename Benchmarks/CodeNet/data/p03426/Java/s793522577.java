import java.util.*;
import java.util.stream.Collectors;

public class Main {

    Scanner in = new Scanner(System.in);

    void solve() {
        int h = in.nextInt(), w = in.nextInt(), d = in.nextInt();
        Pair[] num = new Pair[h * w + 1];
        int[][] field = new int[h+1][w+1];
        for(int i = 1; i <= h; i++) {
            for(int j = 1; j <= w; j++) {
                int a = in.nextInt();
                field[i][j] = a;
                num[a] = new Pair(i, j);
            }
        }

        int posx, posy;
        int q = in.nextInt();
        for(int i = 0; i < q; i++) {
            int l = in.nextInt(), r = in.nextInt();
            if(l == r){
                System.out.println(0);
            }else {
                int ans = 0;
                posx = num[l].x;
                posy = num[l].y;
                while(field[posx][posy] != r) {
                    int nx = num[l + d].x, ny = num[l + d].y;
                    ans += Math.abs(posx - nx) + Math.abs(posy - ny);
                    posx = nx;
                    posy = ny;
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

class Pair{
    int x, y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}