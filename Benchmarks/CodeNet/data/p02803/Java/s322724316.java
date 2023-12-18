import java.io.PrintWriter;
import java.util.*;

public class Main{

    static Scanner sc = new Scanner(System.in);
    static int h = Integer.parseInt(sc.next());
    static int w = Integer.parseInt(sc.next());
    static char[][] s = new char[h][w];

    public void run(){
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        char[][] s = new char[h][w];
    }

    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        long start = System.currentTimeMillis();

        for (int i=0; i<h; i++){
            s[i] = sc.next().toCharArray();
        }

        int ans = 0;

        Set<Integer> set = new TreeSet<>();

        for (int i=0; i<h; i++){
            for (int j=0; j<w; j++){
                if (s[i][j]=='#'){
                    continue;
                }
//                System.out.print(i);
//                System.out.println(j);
                P tmp = new P(i, j);
                int tt = bfs(tmp);
                set.add(tt);
            }
        }
        long end = System.currentTimeMillis();
//        out.println(end-start);
        StringBuilder sb = new StringBuilder();
        sb.append(((TreeSet<Integer>) set).last());
        out.println(sb);
        out.flush();

    }

    public static int bfs(P tmp){
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        int ret = 0;
        Queue<P> queue = new ArrayDeque<>();

        for (int i=0; i<h; i++){
            for (int j=0; j<w; j++){
                ((ArrayDeque<P>) queue).add(tmp);
                int[][] d = new int[h][w];

                d[tmp.s][tmp.t] = 0;

                while (!queue.isEmpty()){
                    P p = ((ArrayDeque<P>) queue).pollFirst();
                    if (p.s==i && p.t==j) break;
                    for (int k=0; k<4; k++){
                        int ny = p.s+dy[k];
                        int nx = p.t+dx[k];
                        if (ny<0 || h<=ny || nx<0 || w<=nx) continue;
                        if (s[ny][nx]=='#') continue;
                        if (d[ny][nx]!=0) continue;
                        P pp = new P(ny, nx);
                        ((ArrayDeque<P>) queue).add(pp);
                        d[ny][nx] = d[p.s][p.t]+1;
                        }
                    }
                ret = Math.max(ret, d[i][j]);
            }
        }
            return ret;
    }

    public static class P{
        int s;
        int t;
        public P(int s, int t){
            this.s = s;
            this.t = t;
        }
    }
}
