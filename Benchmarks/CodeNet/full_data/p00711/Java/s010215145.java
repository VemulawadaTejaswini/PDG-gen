import java.util.*;

class Main{

    int w, h;
    char[][] map;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            w = sc.nextInt(); h = sc.nextInt();
            if(w==0 && h==0) break;

            map = new char[h][w];
            int sx = 0, sy = 0;
            for(int i=0; i<h; i++){
                map[i] = sc.next().toCharArray();
                for(int j=0; j<w; j++){
                    if(map[i][j]=='@'){ sx = j; sy = i;}
                }
            }

            System.out.println(bfs(sx, sy));
        }
    }

    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};

    int bfs(int sx, int sy){
        LinkedList<int[]> q = new LinkedList<int[]>();
        q.add(new int[]{sx, sy});
        boolean[][] v = new boolean[h][w];
        int cnt = 0;

        while(q.size()>0){
            int[] qq = q.poll();
            int x = qq[0], y = qq[1];

            if(v[y][x]) continue;
            v[y][x] = true;
            cnt++;

            for(int i=0; i<4; i++){
                int nx = x + dx[i], ny = y + dy[i];
                if(nx<0 || nx>=w || ny<0 || ny>=h || map[ny][nx]=='#') continue;
                q.add(new int[]{nx, ny});
            }
        }
        return cnt;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}