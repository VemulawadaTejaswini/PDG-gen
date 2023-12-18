import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    private static int N,K;
    private static HashSet where;
    private static int[][][] mem;
    private static int[][][] cum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        mem = new int[2*K][2*K][2];
        where = new HashSet();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt()%(2*K);
            int y = sc.nextInt()%(2*K);
            String c = sc.next();
            mem[y][x][c.equals("B") ? 1:0]++;
            where.add(new int[]{x,y});
        }


        cum = new int[2*K+1][2*K+1][2];
        Iterator<int[]> iter = where.iterator();
        while(iter.hasNext()) {
            int[] xy = iter.next();
            int x = xy[0];
            int y = xy[1];
            cum[y+1][x+1][0] = cum[y][x+1][0] + cum[y+1][x][0] - cum[y][x][0] + mem[y][x][0];
            cum[y+1][x+1][1] = cum[y][x+1][1] + cum[y+1][x][1] - cum[y][x][1] + mem[y][x][1];
        }

        int ans = 0;
        for(int y = 0; y < K; y++) {
            for(int x = 0; x < K; x++) {
                ans = Math.max(ans, eval(x,y));
            }
        }
        System.out.println(ans);
    }

    private static int count(int x1, int y1, int x2, int y2, int c) {
        return cum[y2][x2][c] - cum[y1][x2][c] - cum[y2][x1][c] + cum[y1][x1][c];
    }

    private static int eval(int x, int y) {
        int b1 = count(0,0,x,y,1) + count(K+x,0,2*K,y,1) + count(x,y,K+x,K+y,1) + count(0,K+y,x,2*K,1) + count(K+x,K+y,2*K,2*K,1);
        int w1 = count(x,0,K+x,y,0) + count(0,y,x,K+y,0) + count(K+x,y,2*K,K+y,0) + count(x,K+y,K+x,2*K,0);
        int b2 = count(0,0,x,y,0) + count(K+x,0,2*K,y,0) + count(x,y,K+x,K+y,0) + count(0,K+y,x,2*K,0) + count(K+x,K+y,2*K,2*K,0);
        int w2 = count(x,0,K+x,y,1) + count(0,y,x,K+y,1) + count(K+x,y,2*K,K+y,1) + count(x,K+y,K+x,2*K,1);
        return Math.max(b1+w1, b2+w2);
     }
}