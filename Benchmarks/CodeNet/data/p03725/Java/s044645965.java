import java.io.*;
import java.util.*;

public class Main implements Runnable {

    private void solve() throws IOException {

        int R = nextInt();
        int C = nextInt();
        int K = nextInt();

        String[] s = new String[R];
        for(int i = 0; i < R; ++i) {
            s[i] = reader.readLine();
        }
        Queue<Integer> q = new LinkedList<>();
        int[][] dist = new int[R][C];
        for(int[] ini : dist) Arrays.fill(ini,1 << 30);
        int meR = -1;
        int meC = -1;
        for(int i = 0; i < R; ++i) {
            for(int j = 0; j < C; ++j) {
                if(s[i].charAt(j) == 'S') {
                    meR = i;
                    meC = j;
                }
            }
        }
        dist[meR][meC] = 0;
        q.offer(meR);
        q.offer(meC);

        Queue<Integer> special = new LinkedList<>();

        int best = Integer.MAX_VALUE;
        int[] dx = new int[] { -1,0,1,-1 };
        int[] dy = new int[] { 0,0,1,-1 };

        while(!q.isEmpty()) {

            boolean move = false;
            int r = q.poll();
            int c = q.poll();
            if(r == 0 || c == 0 || r == R - 1 || c == C - 1) {
                writer.println(1);
                return;
            }
            for(int a = 0; a < 4; ++a){
                int x = dx[a] + r;
                int y = dy[a] + c;
                if(x >=0 && x < R && y >=0 && y < C && s[x].charAt(y) == '.') {
                    if(dist[x][y] > dist[r][c] + 1 && ((dist[r][c] + 1 <= K))) {
                        dist[x][y] = dist[r][c] + 1;
                        q.offer(x);
                        q.offer(y);
                        move = true;
                    }
                }
            }
            if(!move) {
                special.offer(r);
                special.offer(c);
            }

        }
        while(!special.isEmpty()) {
            int r = special.poll();
            int c = special.poll();
            int curMin = Math.min(r,c);
            curMin = Math.min(curMin,Math.min(R-r,C-c));

            int need = curMin / K;
            if(curMin % K != 0) ++need;
            best = Math.min(best, need + 1);

        }
        writer.println(best);
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
//            reader = new BufferedReader(new FileReader("input.txt"));
            //            reader2 = new BufferedReader(new FileReader("1.in"));
            tokenizer = null;
            writer = new PrintWriter(System.out);
//            writer = new     PrintWriter("output.txt");
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