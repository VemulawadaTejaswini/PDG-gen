import java.io.*;
import java.util.*;
import java.math.*;

public class main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static String line;
    public static StringTokenizer st;
    public static ArrayList<ArrayList<Integer>> adjList;
    public static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1};
    public static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1};
    public static int INF = 0x3f3f3f3f;
    public static int MOD = 1000000007;

    public static void main(String[] args) throws Exception{
        String s = br.readLine();
        boolean f = false;
        for(int i = 0; i < s.length()-1; i++){
            if(s.substring(i, i+2).equals("AC")){
                f = true;
                break;
            }
        }
        pw.print(f ? "Yes\n" : "No\n");

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