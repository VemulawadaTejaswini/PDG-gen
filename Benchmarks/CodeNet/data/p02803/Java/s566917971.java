import java.util.*;

public class Main{

    static Scanner sc = new Scanner(System.in);
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int h = sc.nextInt();
    static int w = sc.nextInt();
    static char[][] s = new char[h][w];

    public static void main(String[] args){

        for (int i=0; i<h; i++){
            s[i] = sc.next().toCharArray();
        }

        int ans = 0;


        for (int i=0; i<h; i++){
            for (int j=0; j<w; j++){
                if (s[i][j]=='#'){
                    continue;
                }
                P tmp = new P(i, j);
                int tt = bfs(tmp);
                ans = Math.max(ans, tt);
//                System.out.println(ans);
            }
        }
        System.out.println(ans);


    }

    public static int bfs(P tmp){
        int ret = 0;
        Queue<P> queue = new ArrayDeque<>();
        ((ArrayDeque<P>) queue).add(tmp);
//        System.out.println(queue);
        int[][] d = new int[h][w];
//        for (int i=0; i<h; i++){
//            for (int j=0; j<w; j++){
//                d[i][j] = Integer.MAX_VALUE;
//            }
//        }
//        d[tmp.s][tmp.t] = 0;
        for (int i=0; i<h; i++){
            for (int j=0; j<w; j++){
                for (int f=0; f<h; f++){
                    for (int g=0; g<w; g++){
                        d[f][g] = Integer.MAX_VALUE;
                    }
                }
                d[tmp.s][tmp.t] = 0;

                int[] goal = {i, j};
//                int[] goal = {0, 4};
                while (!queue.isEmpty()){
                    P p = ((ArrayDeque<P>) queue).poll();
                    if (p.s==i && p.t==j) break;
                    for (int k=0; k<4; k++){
                        int ny = p.s+dy[k];
                        int nx = p.t+dx[k];
                        if (0<=ny && ny<h && 0<=nx && nx<w && s[ny][nx]!='#' && d[ny][nx]==Integer.MAX_VALUE){
                            P pp = new P(ny, nx);
                            ((ArrayDeque<P>) queue).add(pp);
//                            System.out.println(p.s);
//                            System.out.println(p.t);
                            d[ny][nx] = d[p.s][p.t]+1;
                        }
                    }
                }
                if (d[i][j]!=Integer.MAX_VALUE){
                    ret = Math.max(ret, d[i][j]);
                }
            }
        }
//        System.out.println(ret);
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
