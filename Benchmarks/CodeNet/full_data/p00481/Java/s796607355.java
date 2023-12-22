import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
public class Main {
    static int H;
    static int W;
    static int N;
    static char[][] field=new char[1001][1001];
    static int[][] num=new int[1001][1001];
    static int sx=0, sy=0;
    static int INF=100000000;
    static int[][] d=new int[1001][1001];
    static int[] dx= {1, 0, -1, 0};
    static int[] dy= {0, 1, 0, -1};
    static int sum=0;
 
    static class State{
        int h, w;
        State(int h, int w){
            this.h=h;
            this.w=w;
        }
    }
 
    static int bfs(int sx, int sy, int c) {
        for(int i=0; i<H; i++) {
            for(int j=0; j<W; j++) {
                d[i][j]=INF;
            }
        }
        d[sx][sy]=0;
        Queue<State> queue=new LinkedList<>();
        queue.add(new State(sx, sy));
 
 
        int minstep=0;
        int nextx=0, nexty=0;
        while(!queue.isEmpty()) {
            State state=queue.remove();
            //System.out.println(state.h+" "+state.w+" "+d[state.h][state.w]);
            if(num[state.h][state.w]==c) {
                minstep=d[state.h][state.w];
                nextx=state.h;
                nexty=state.w;
                //System.out.println(nextx+" "+nexty+" "+minstep);
                break;
            }
            for(int i=0; i<4; i++) {
                int nx=state.h+dx[i];
                int ny=state.w+dy[i];
                if(nx>=0 && nx<H && ny>=0 && ny<W && d[nx][ny]==INF) {
                    if(field[nx][ny]=='.') {
                        d[nx][ny]=d[state.h][state.w]+1;
                        queue.add(new State(nx, ny));
                    }
                    else if(field[nx][ny]=='X') {
                        continue;
                    }
                    else {
                        d[nx][ny]=d[state.h][state.w]+1;
                        queue.add(new State(nx, ny));
                    }
                }
            }
        }
        sum+= minstep;
        if(c!=N) {
            bfs(nextx, nexty, c+1);
        }
        return sum;
    }
 
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            H=sc.nextInt();
            W=sc.nextInt();
            N=sc.nextInt();
 
            for(int i=0; i<H; i++) {
                String str=sc.next();
                for(int j=0; j<W; j++) {
                    field[i][j]=str.charAt(j);
                    if(field[i][j]=='S') {
                        sx=i; sy=j;
                        field[i][j]='.';
                    }
                    else if(field[i][j]!='X' && field[i][j]!='.') {
                        num[i][j]=str.charAt(j)-'0';
                    }
                }
            }
            System.out.println(bfs(sx, sy, 1));
 
 
 
        }
    }
}
