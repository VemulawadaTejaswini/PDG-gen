import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int n;
    static int[][] ady;
    static int[] od;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken())-1;
        int y = Integer.parseInt(st.nextToken())-1;
        ady = new int[n][n];
        od = new int[n];
        for (int i = 0; i < n-1; i++)
        {
            ady[i][od[i]++] = i+1;
            ady[i+1][od[i+1]++] = i;
        }
        ady[x][od[x]++] = y;
        ady[y][od[y]++] = x;
        HashMap<Integer, Integer> pairs = new HashMap<>();
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            dist[i] = bfs(i);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                pairs.put(dist[i][j], 1+pairs.getOrDefault(dist[i][j], 0));
            }
        }

        for (int k = 1; k < n; k++) {
            System.out.println(pairs.getOrDefault(k, 0));
        }
    }

    static int[] bfs(int or) {
        LinkedList<Integer> L = new LinkedList<>();
        LinkedList<Integer> at = new LinkedList<>();
        at.offer(or);
        L.offer(0);
        HashSet<Integer> visited = new HashSet<>();
        visited.add(or);
        int[] dist = new int[n];
        while (!at.isEmpty()) {
            int u = at.poll();
            int d = L.poll();
            for (int i = 0; i < od[u]; i++) {
                int v = ady[u][i];
                if (visited.contains(v)) continue;
                visited.add(v);
                dist[v] = d + 1;
                L.offer(d + 1);
                at.offer(v);
            }
        }
        return dist;
    }

}
