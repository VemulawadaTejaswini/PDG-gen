import java.io.*;
import java.util.*;

public class Main implements Runnable {

    boolean[][] forbidden = new boolean[2011][2011];
    StringBuilder sb = new StringBuilder("");

    int[] dx = new int[] { 1,-1,0,0 };
    int[] dy = new int[] { 0,0,1,-1 };
    private void solve() throws IOException {

        int sx = nextInt();
        int sy = nextInt();

        int tx = nextInt();
        int ty = nextInt();

        sb = new StringBuilder("");

        int curx = sx;
        int cury = sy;

        while(cury < ty) {
            ++cury;
            sb.append("U");
        }
        while(curx < tx) {
            ++curx;
            sb.append("R");
        }
        sb.append("U");
        ++cury;
        while(curx >= sx) {
            --curx;
            sb.append("L");
        }
        while(cury > sy) {
            --cury;
            sb.append("D");
        }
        sb.append("R");
        curx = sx;
        cury = sy;

        sb.append("D");
        --cury;
        while(curx <= tx) {
            ++curx;
            sb.append("R");
        }
        while(cury < ty) {
            ++cury;
            sb.append("U");
        }
        sb.append("L");
        curx = tx;
        cury = ty;
        while(cury > sy) {
            --cury;
            sb.append("D");
        }
        while(curx > sx) {
            --curx;
            sb.append("L");
        }
        writer.println(sb);

//        go(sx,sy,tx,ty);
//        go(tx,ty,sx,sy);
//        go(sx,sy,tx,ty);
//        go(tx,ty,sx,sy);

    }

    private void go(int sx, int sy, int tx, int ty) {

        sx += 1005;
        sy += 1005;
        tx += 1005;
        ty += 1005;
        forbidden[sx][sy] = false;
        forbidden[tx][ty] = false;

        Queue<Integer> q = new LinkedList<>();
        q.offer(sx);
        q.offer(sy);
        int[][] px = new int[2011][2011];
        int[][] py = new int[2011][2011];

        px[sx][sy] = sx;
        py[sx][sy] = sy;

        boolean[][] used = new boolean[2011][2011];

        while(!q.isEmpty()) {
            int r=  q.poll();
            int c = q.poll();

            for(int a = 0; a < 4; ++a) {
                int x = dx[a] + r;
                int y = dy[a] + c;
                if(x >=0 && x <= 2010 && y >=0 && y <= 2010 && !used[x][y] && !forbidden[x][y]) {
                    used[x][y] = true;
                    px[x][y] = r;
                    py[x][y] = c;
                    q.offer(x);
                    q.offer(y);
                }
            }

        }
        int endX = tx;
        int endY = ty;
        String temp = "";

        System.out.println(endX + " " + endY + " " +  used[endX][endY]);
        System.out.println(px[endX][endY] + " " + py[endX][endY]);
        System.out.println(px[1006][1006] + " " + py[1006][1006]);
        System.out.println(px[1006][1005] + " " + py[1006][1005]);
        System.out.println(sx + " " + sy);
        while((endX != sx) || ((endY != sy))) {

            int prevX = px[endX][endY];
            int prevY = py[endX][endY];
            char stepp = '!';
            if(prevX + 1 == endX) {
                stepp = 'R';

            } else if(prevX - 1 == endX) {
                stepp = 'L';
            } else if(prevY + 1 == endY) {
                stepp = 'D';
            } else stepp = 'U';
            temp = stepp + temp;

            int tempX = px[endX][endY];
            int tempY = py[endX][endY];
            endX = tempX;
            endY=  tempY;
        }
        sb.append(temp);
    }

    public static void main(String[] args) {
        new Main().run();
    }

    BufferedReader reader;
    //    BufferedReader reader2;
    StringTokenizer tokenizer;
    PrintWriter writer;
    //    BufferedWriter writer;

    public void run() {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
//            reader = new BufferedReader(new FileReader("highcard.in"));
            //            reader2 = new BufferedReader(new FileReader("1.in"));
            tokenizer = null;
            writer = new PrintWriter(System.out);
//            writer = new     PrintWriter("highcard.out");
//                                                    writer = new BufferedWriter(System.out);
            //                        writer = new BufferedWriter(new OutputStreamWriter(System.out));
            solve();
            reader.close();
            //            reader2.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    short nextShort() throws IOException {
        return Short.parseShort(nextToken());
    }

    String nextToken() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }

        return tokenizer.nextToken();
    }

}