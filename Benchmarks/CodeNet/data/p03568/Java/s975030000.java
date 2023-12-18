import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static String line;
    public static StringTokenizer st;
    public static ArrayList<ArrayList<Integer>> adjList;
    public static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1};
    public static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1};
    public static int INF = 0x3f3f3f3f;
    public static int MOD = 1000000007;

    public static int[] A;
    public static int T;

    public static int solve(int index, boolean even){
        if(index == T) return even ? 1 : 0;
        int total = 0;
        for(int i = -1; i <= 1; i++){
            if((A[index] + i) % 2 == 0){
                total += solve(index+1, true);
            } else{
                total += solve(index+1, even);
            }
        }
        return total;
    }

    public static void main(String[] args) throws Exception{
        T = Integer.parseInt(br.readLine());
        A = new int[T];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < T; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        pw.print(solve(0, false) + "\n");

        pw.close(); 
        br.close();
    }
}

class Pair{
    public long x, y;

    Pair(long _x, long _y){
        x = _x;
        y = _y;
    }
}
class Point implements Comparable<Point>{
    public double x, y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public int compareTo(Point p){
        if(x != p.x) return x < p.x ? -1 : 1;
        else if(y != p.y) return y < p.y ? -1 : 1;
        return 0;
    }
}