import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] map = new char[n][];
        for(int i = 0; i < n; i++){
            map[i] = sc.next().toCharArray();
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                for(int k = 0; k < n; k++){
                    for(int l = 0; l < m; l++){
                        if((i == k) && (j == l)){
                            continue;
                        }
                        if(map[i][j] == '.' && map[k][l] == '.'){
                            ans = Math.max(ans,bfs(n,m,map,i,j,k,l));
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static int bfs(int n, int m, char[][]map,int sy,int sx,int gy, int gx){
        char[][] bfsmap = new char[n][];
        for(int i = 0; i < n; i++){
            bfsmap[i] = map[i].clone();
        }
        Point[] D4 = {new Point(-1, 0),new Point(1,0), new Point(0,1), new Point(0,-1)};
        Point start = new Point(sx, sy), goal = new Point(gx, gy);
        boolean arrived = false;
	    int[][] moves = new int[n][m];
	    for(int i = 0; i < n; i++){
            Arrays.fill(moves[i],99999999);
        }
        moves[sy][sx] = 0;
        ArrayDeque<Point> dq = new ArrayDeque<>();
        dq.add(start);

        while (dq.size() > 0) {
            Point p = dq.removeFirst();
            for (int i=0; i<4; i++) {
                int x = p.getX()+D4[i].getX();
                int y = p.getY()+D4[i].getY();
                if(!(0 <= y && y < n && 0 <= x && x < m)){
                    continue;
                }
                else if (bfsmap[y][x] == '.') {
                    dq.addLast(new Point(x, y));
                    bfsmap[y][x] = '#';
                    moves[y][x] = Math.min(moves[y][x],moves[p.getY()][p.getX()] + 1);
                }
                if(x == gx && y == gy){
                    arrived = true;
                }
            }
            if(arrived){
                break;
            }
        }
        if(arrived){
            return moves[goal.getY()][goal.getX()];
        }else{
            return -1;
        }
    }
}

class Point{

	private int x;
	private int y;

	Point(int a, int b) {x=a; y=b;}

	int getX() {return x;}
	int getY() {return y;}
	void setX(int n) {x = n;}
	void setY(int n) {y = n;}

}