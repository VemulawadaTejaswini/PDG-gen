import java.util.*;
import java.io.*;

public class Main {
    public static void main(String arg[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        boolean visited[][] = new boolean[H][W];
        Queue<Point> q = new LinkedList<>();
        for(int i=0;i<H;i++){
            st = new StringTokenizer(br.readLine());
            String value = st.nextToken();
            for(int j=0;j<W;j++) {
                char c = value.charAt(j);
                if (c == '#') {
                    q.add(new Point(i,j));
                    visited[i][j] = true;
                }
            }
        }
        q.add(new Point(-1,-1));
        int op = 0;
        boolean trigger = false;
        while(!q.isEmpty()){
            Point p = q.poll();
            if(p.H==-1&&p.W==-1){
                if(trigger) {
                    op++;
                    q.add(new Point(-1, -1));
                    trigger = false;
                }
                continue;
            }
            int dr[] = {-1, 0, 0, 1};
            int dc[] = { 0,-1, 1, 0};
            for(int i=0;i<4;i++){
                int nH = p.H+dr[i];
                int nW = p.W+dc[i];
                if(nH<0||nH>=H){
                    continue;
                }
                if(nW<0||nW>=W){
                    continue;
                }
                if(visited[nH][nW]){
                    continue;
                }
                visited[nH][nW] = true;
                q.add(new Point(nH,nW));
                trigger = true;
            }
        }
        System.out.println(op);
    }
}

class Point{
    int H;
    int W;
    Point(int H,int W){
        this.H = H;
        this.W = W;
    }
}
