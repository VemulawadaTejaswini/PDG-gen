import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

class Main{
    static int[][] path=new int[50][50];



    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int H=scan.nextInt();
        int W=scan.nextInt();
        int cnt =0;
        for(int[] i : path)Arrays.fill(i,-1);
        for(int i=0;i<H;++i){
            String s = scan.next();
            for(int j=0;j<W;++j){
                path[i][j]=(s.charAt(j)=='.' ? 10000:-1);
                if(s.charAt(j)=='.')++cnt;
            }
        }
        int[] dx ={0,-1,0,1};
        int[] dy={1,0,-1,0};

        path[0][0]=0;
        Deque<Integer> que = new ArrayDeque<>();
        que.add(0);
        while(!que.isEmpty()){
            int h = que.peek()/W;
            int w = que.poll()%W;
            for(int i=0;i<4;++i){
                if(h+dy[i]<0 || h+dy[i] >=H || w+dx[i]<0 || w+dx[i]>=W || path[h+dy[i]][w+dx[i]]==-1 || path[h+dy[i]][w+dx[i]]<=path[h][w]+1)continue;
                path[h+dy[i]][w+dx[i]]=path[h][w]+1;
                que.add((h+dy[i])*W + w+dx[i]);
            }
        }
        if(path[H-1][W-1]==-1)System.out.println(-1);
        else System.out.println(cnt - path[H-1][W-1]);
    }
}