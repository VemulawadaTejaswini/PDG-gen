import java.util.*;

class Main{

    char[][] map;
    int[][] pos;
    int h, w, n;
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};

    void solve(){
        Scanner sc = new Scanner(System.in);

        h = sc.nextInt();
        w = sc.nextInt();
        n = sc.nextInt();

        map = new char[h][w];
        pos = new int[n+1][2];

        for(int i=0; i<h; i++){
            char[] c = sc.next().toCharArray();
            for(int j=0; j<w; j++){
                map[i][j] = c[j];
                if(c[j]=='S'){
                    pos[0][0] = j; pos[0][1] = i;
                }
                if(Character.isDigit(c[j])){
                    pos[c[j]-'0'][0] = j; pos[c[j]-'0'][1] = i;
                }
            }
        }

        int sum = 0;
        for(int i=0; i<n; i++){
            int num = dijstra1(i, i+1);
            sum += num;
        }

        System.out.println(sum);
    }

    int dijstra1(int start, int goal){
        //x, y
        LinkedList<int[]> q = new LinkedList<int[]>();
        q.add(new int[]{pos[start][0], pos[start][1], 0});

        int[][] v = new int[h][w];

        while(q.size()>0){
            int[] xy = q.poll();
            int x = xy[0], y = xy[1];
            if(x==pos[goal][0] && y==pos[goal][1]) return v[y][x];

            for(int i=0; i<4; i++){
                int nx = x + dx[i], ny = y + dy[i];
                if(nx<0 || nx>=w || ny<0 || ny>=h || v[ny][nx]!=0
                   || map[ny][nx]=='X') continue;
                v[ny][nx] = v[y][x] + 1;
                q.add(new int[]{nx, ny});
            }
        }
        return -1;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}