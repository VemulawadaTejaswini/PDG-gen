import java.util.*;

class Main{

    int h, w, n;
    char[][] map;

    void solve(){
        Scanner sc = new Scanner(System.in);

        h = sc.nextInt();
        w = sc.nextInt();
        n = sc.nextInt();

        int sx = 0, sy = 0;
        int[][] cheese = new int[n][2];
        map = new char[h][w];
        for(int i=0; i<h; i++){
            String s = sc.next();
            for(int j=0; j<w; j++){
                map[i][j] = s.charAt(j);
                if(map[i][j]=='S'){
                    sx = j; sy = i;
                }
                if(map[i][j]-'0'>0 && map[i][j]-'0'<=n){
                    cheese[map[i][j]-'0'-1][0] = j;
                    cheese[map[i][j]-'0'-1][1] = i;
                }
            }
        }

        int cnt = 0;
        for(int i=0; i<n; i++){
            if(i==0) cnt += bfs(sx, sy, cheese[i][0], cheese[i][1]);
            else cnt += bfs(cheese[i-1][0], cheese[i-1][1], cheese[i][0], cheese[i][1]);
        }
        System.out.println(cnt);
    }

    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    int bfs(int sx, int sy, int gx, int gy){
        // x, y, cnt
        LinkedList<int[]> list = new LinkedList<int[]>();
        list.add(new int[]{sx, sy, 0});
        boolean[][] v = new boolean[h][w];

        while(list.size()>0){
            int[] p = list.poll();
            int x = p[0], y = p[1], cnt = p[2];

            if(x==gx && y==gy) return cnt;
            if(v[y][x]) continue;
            v[y][x] = true;
            
            for(int i=0; i<4; i++){
                int nx = x + dx[i], ny = y + dy[i];
                if(nx<0 || nx>=w || ny<0 || ny>=h) continue;
                if(map[ny][nx]!='X') list.add(new int[]{nx, ny, cnt+1});
            }
        }
        return -1;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}