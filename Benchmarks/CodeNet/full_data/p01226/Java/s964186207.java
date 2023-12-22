import java.util.*;

class Main{

    int w, h;
    char[][] map;
    int[] dx = {0, 0, -1, 1};
    int[] dy = {-1, 1, 0, 0};
    char[] dirc = {'^', 'v', '<', '>'};

    void solve(){
        Scanner sc = new Scanner(System.in);

        int dataNum = sc.nextInt();
        while(dataNum-->0){
            h = sc.nextInt(); w = sc.nextInt();
            map = new char[h][w];

            int x = 0, y = 0, dir = 0;

            for(int i=0; i<h; i++){
                char[] line = sc.next().toCharArray();
                for(int j=0; j<w; j++){
                    map[i][j] = line[j];
                    if(map[i][j]=='^'){ x = j; y = i; dir = 0;}
                    if(map[i][j]=='v'){ x = j; y = i; dir = 1;}
                    if(map[i][j]=='<'){ x = j; y = i; dir = 2;}
                    if(map[i][j]=='>'){ x = j; y = i; dir = 3;}
                }
            }

            int n = sc.nextInt();
            char[] command = sc.next().toCharArray();
            for(int i=0; i<n; i++){
                if(command[i]=='U') dir = 0;
                if(command[i]=='D') dir = 1;
                if(command[i]=='L') dir = 2;
                if(command[i]=='R') dir = 3;
                if(command[i]!='S'){
                    int nx = x + dx[dir], ny = y + dy[dir];
                    if(nx<0 || nx>=w || ny<0 || ny>=h) continue;
                    if(map[ny][nx]=='.'){
                        map[ny][nx] = dirc[dir];
                        map[y][x] = '.';
                        x = nx; y = ny;
                    }
                }
                if(command[i]=='S'){
                    int nx = x, ny = y;
                    while(true){
                        nx += dx[dir]; ny += dy[dir];
                        if(nx<0 || nx>=w || ny<0 || ny>=h || map[ny][nx]=='#') break;
                        if(map[ny][nx]=='*'){
                            map[ny][nx] = '.';
                            break;
                        }
                    }
                }                
            }
            for(int i=0; i<h; i++) System.out.println(String.valueOf(map[i]));
            if(dataNum!=0) System.out.println();
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}