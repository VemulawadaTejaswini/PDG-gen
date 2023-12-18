import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    private static void dfs(int i, ArrayList<Integer>[] map, int[] degree, int[] dist, boolean[] visited) {
        if(visited[i]) {
            return;
        }
        visited[i] = true;
        if(map[i] == null) {
            return;
        }
        for (Integer to : map[i]) {
            degree[to]--;
            dist[to] = Math.max(dist[i] + 1, dist[to]);
            if(degree[to] == 0) {
                dfs(to, map, degree, dist, visited);
            }
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] degree = new int[n+1];
        boolean[] visited = new boolean[n+1];
        int[] dist = new int[n+1];
        ArrayList<Integer>[] map = new ArrayList[n+1];
        for (int i = 0; i < m; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            if(map[from] == null) {
                map[from] = new ArrayList<>();
            }
            map[from].add(to);
            ++degree[to];
        }

        for (int i = 0; i < n + 1; i++) {
           if(!visited[i] && degree[i] == 0) {
               dfs(i, map, degree, dist, visited);
           }
        }
        int max = 0;
        for (int i = 0; i < n + 1; i++) {
           max = Math.max(max, dist[i]);
        }
        System.out.println(max);
    }


}