import java.util.*;

public class Main {

    static int h;
    static int w;

    static char[][] field;
    static Deque<Pair> deq = new ArrayDeque<Pair>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        h = sc.nextInt();
        w = sc.nextInt();

        field = new char[h][w];
        final int inf = 10000;

        for (int i = 0; i < h; i++) {
                field[i] = sc.next().toCharArray();
        }

        int[][] dist = new int[h][w];

        for (int i = 0; i < h; i++) Arrays.fill(dist[i], inf);

        if (field[0][0] == '.') {
            dist[0][0] = 0;
        } else {
            dist[0][0] = 1;
        }

        Pair s = new Pair(0, 0);
        Pair g = new Pair(h - 1, w - 1);
        deq.addFirst(s);

        final int[] dx = new int[] {0,1};
        final int[] dy = new int[] {1,0};

        while(!deq.isEmpty()) {
            Pair p = deq.pollLast();
            if(p.equals(g)) break;
            for (int i = 0; i < 2; i++) {
                int nx = p.x+dx[i], ny = p.y+dy[i];
                if(nx < h && nx >= 0 && ny < w && ny>= 0) {
                    if(field[nx][ny] == '#') {
                        if(dist[nx][ny] > dist[p.x][p.y]+1) {
                            dist[nx][ny] = dist[p.x][p.y] + 1;
                        }
                    } else {
                        if(dist[nx][ny] > dist[p.x][p.y]) {
                            dist[nx][ny] = dist[p.x][p.y];
                        }
                    }
                    deq.addFirst(new Pair(nx, ny));
                }
            }
        }

         System.out.println(dist[h - 1][w - 1]);

        sc.close();
    }

    public static class Pair {
        int x; int y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public boolean equals(Object obj) {
            return ((Pair)obj).x==x&&((Pair)obj).y==y;
        }
    }

}