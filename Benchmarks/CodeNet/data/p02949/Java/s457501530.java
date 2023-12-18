import java.util.*;

public class Main {

    static boolean hasCycle = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int[][] e = new int[m][3];
        for (int i = 0; i < m; i++) {
            e[i][0] = sc.nextInt()-1;
            e[i][1] = sc.nextInt()-1;
            e[i][2] = -sc.nextInt() + p;
        }
        long[] d = bellmanFord(n, e, 0);
        System.out.println(hasCycle || d[n-1] == Long.MAX_VALUE ? -1 : Math.max(-d[n-1], 0));
        sc.close();

    }

    public static long[] bellmanFord(int n, int[][] edge, int s){
        long d[] = new long[n];
        Arrays.fill(d, Long.MAX_VALUE);
        d[s] = 0L;
        for (int i = 0; i < n-1; i++) {
            for(int j = 0; j < edge.length; j++){
                int[] e = edge[j];
                if(d[e[0]] != Long.MAX_VALUE && d[e[1]] > d[e[0]] + e[2]){
                    d[e[1]] = d[e[0]] + (long)e[2];
                }
            }
        }
        long[] dCopy = Arrays.copyOf(d, n);
        for (int i = 0; i < n-1; i++) {
            for(int j = 0; j < edge.length; j++){
                int[] e = edge[j];
                if(d[e[0]] != Long.MAX_VALUE && d[e[1]] > d[e[0]] + e[2]){
                    d[e[1]] = d[e[0]] + (long)e[2];
                }
            }
        }
        if(d[n-1] < dCopy[n-1]) hasCycle = true;
        return dCopy;
    }

}
