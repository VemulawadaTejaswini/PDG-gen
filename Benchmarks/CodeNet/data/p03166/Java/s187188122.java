import java.util.*;
import java.io.*;

public class Main {

    public static HashSet<Integer>[] edges;
    public static int[] dist;

    public static int DFS(int n) {

        if(edges[n].isEmpty())
            return dist[n];

        int max = 0;
        for(int conn : edges[n])
            if(dist[conn] == -1) {
                dist[conn] = 1+dist[n];
                max = Math.max(DFS(conn), max);
                dist[conn] = -1;
            }

        return max;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        edges = new HashSet[n+1];
        dist = new int[n+1];

        for(int i = 0; i < n+1; i++) {
            edges[i] = new HashSet<Integer>();
            dist[i] = -1;
        }

        int[] numParents = new int[n+1];

        while(m-- > 0) {

            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            edges[x].add(y);
            numParents[y]++;
        }

        ArrayDeque<Integer> q = new ArrayDeque<>();

        int maxDist = 0;

        for(int i = 1; i <= n; i++) {
            if (numParents[i] == 0) {
                dist[i] = 0;
                maxDist = Math.max(maxDist, DFS(i));
            }
        }

        pw.println(maxDist);
        pw.flush();
        
    }

}