import java.util.*;

class Main{

    int h, w;
    char[][] map;
    boolean B, W;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            w = sc.nextInt(); h = sc.nextInt();
            if(w==0 && h==0) break;
            map = new char[h][w];
            for(int i=0; i<h; i++) map[i] = sc.next().toCharArray();

            int cntB = 0, cntW = 0;
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    if(map[i][j]!='.') continue;
                    B = false;
                    W = false;
                    bfs(i, j);
                    if(B && !W) cntB++;
                    if(!B && W) cntW++;
                }
            }
            System.out.println(cntB+" "+cntW);
        }
    }

    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};
    void bfs(int y, int x){
        LinkedList<int[]> q = new LinkedList<int[]>();
        q.add(new int[]{x, y});
        boolean[][] v = new boolean[h][w];

        while(q.size()>0){
            int[] qq = q.poll();
            int X = qq[0], Y = qq[1];

            if(v[Y][X]) continue;
            v[Y][X] = true;

            if(map[Y][X]=='W') {W = true; continue;}
            if(map[Y][X]=='B') {B = true; continue;}

            for(int i=0; i<4; i++){
                int nx = X + dx[i], ny = Y + dy[i];
                if(nx<0 || nx>=w || ny<0 || ny>=h) continue;
                q.add(new int[]{nx, ny});
            }
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}