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

    public static void main(String[] args) throws Exception{
        char[] s = br.readLine().toCharArray();
        int[] memo = new int[1 << 26];
        Arrays.fill(memo, INF);
        int mask = 0;
        int[] opt = new int[s.length];
        for(int i = 0; i < s.length; i++){
            mask ^= (1 << (s[i] - 'a'));
            if(Integer.bitCount(mask) <= 1){
                memo[mask] = 1;
                opt[i] = 1;
            } else{
                int min = Math.min(memo[mask], i);
                for(int j = 0; j < 26; j++){
                    min = Math.min(min, memo[mask ^ (1 << j)]);
                }
                memo[mask] = Math.min(min + 1, memo[mask]);
                opt[i] = min + 1;
            }
        }
        pw.print(opt[s.length-1] + "\n");


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