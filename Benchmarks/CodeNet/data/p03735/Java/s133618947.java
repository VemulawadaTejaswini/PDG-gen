import java.io.*;
import java.util.*;
import java.text.*;
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
    public static long LINF = 0x3f3f3f3f3f3f3f3fL;
    public static int MOD = 1000000007;

    public static long f(long min, long max, long a){
        return Math.max(max, a) - Math.min(min, a);
    }

    public static void main(String[] args) throws Exception{
        int N = Integer.parseInt(br.readLine());
        int[] x = new int[N];
        int[] y = new int[N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        long minX = x[0];
        long maxX = x[0];

        long minY = y[0];
        long maxY = y[0];

        for(int i = 1; i < N; i++){
            long ans1 = f(minX, maxX, x[i]) * f(minY, maxY, y[i]);
            long ans2 = f(minX, maxX, y[i]) * f(minY, maxY, x[i]);
            if(ans1 < ans2){
                minX = Math.min(minX, x[i]);
                maxX = Math.max(maxX, x[i]);
                minY = Math.min(minY, y[i]);
                maxY = Math.max(maxY, y[i]);
            } else{
                minX = Math.min(minX, y[i]);
                maxX = Math.max(maxX, y[i]);
                minY = Math.min(minY, x[i]);
                maxY = Math.max(maxY, x[i]);
            }
        }

        pw.print((maxX - minX) * (maxY - minY) + "\n");


        pw.close(); 
        br.close();
    }
}

class Pair implements Comparable<Pair>{
    public int x, y;

    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int compareTo(Pair p){
        if(x != p.x) return x < p.x ? -1 : 1;
        else if(y != p.y) return y < p.y ? -1 : 1;
        return 0;
    }
}