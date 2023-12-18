import java.awt.Point;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main0{
    static char[][] mat;
    static int[][] cs;
    static int INF = Integer.MAX_VALUE/2;
    static int H,W;
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        sc.nextLine();
        mat = new char[H][W];
        int posMarcadas = 0;
        int movX[] = new int[]{-1,1,0,0};
	int movY[] = new int[]{0,0,-1,1};
        
        String line;
        for(int i = 0; i < H; i++){
            line = sc.nextLine();
            for(int j = 0; j < W; j++){
                mat[i][j] = line.charAt(j);
                if(mat[i][j] == '#')
                    posMarcadas++;
            }
        }
        
        cs = new int[H][W];
        for(int[] c : cs)
            Arrays.fill(c, INF);
        cs[0][0] = 0;
        
        Queue<Pair<Integer, Point>> q = new LinkedList<Pair<Integer, Point>>();
        q.offer(new Pair(1, new Point(0,0)));
        Pair<Integer, Point> t;
        int x, y;
        int d;
        while(!q.isEmpty()){
            t = q.poll();
            d = t.first;
            x = t.second.x;
            y = t.second.y;
            
            if(x == H-1 && y == W-1)
                break;
            
            for(int i = 0; i < 4; i++){
                if(valido(x + movX[i], y + movY[i], d+1)){
                    q.offer(new Pair(d+1, new Point(x + movX[i], y + movY[i])));
                    cs[x + movX[i]][y + movY[i]] = d+1;
                }
            }
        }
        
        if(cs[H-1][W-1] != INF){
            System.out.println((H*W)-posMarcadas-cs[H-1][W-1]);
        }else{
            System.out.println(-1);
        }
    }
    private static boolean valido(int x, int y, int d){
        if(x >= 0 && x < H && y >= 0 && y < W && mat[x][y] == '.' && d < cs[x][y])
            return true;
        return false;
    }
    static class Pair<T, R>{
        T first;
        R second;
        public Pair(T f, R s){
            first = f;
            second = s;
        }
    }
}