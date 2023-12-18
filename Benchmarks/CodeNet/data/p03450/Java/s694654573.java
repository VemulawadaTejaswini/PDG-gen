import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer, Integer>[] d = new HashMap[n+1];
        for (int i = 0; i <= n; i++) {
            d[i] = new HashMap<Integer, Integer>();
        }
        
        for (int i = 0; i < m; i++) {
            int xLi = sc.nextInt();
            int xRi = sc.nextInt();
            int xDi = sc.nextInt();
            d[xLi].put(xRi, xDi);
            d[xRi].put(xLi, -xDi);
        }

        boolean[][] visited = new boolean[n+1][n+1];
        long[] pos = new long[n+1];
        
        Queue<Integer> q = new LinkedList<Integer>();
        
        for (int i = 1; i <= n; i++) {
            if (visited[i][i]) continue;
            
            q.add(i);
            pos[i] = 0;
            visited[i][i] = true;
            while (!q.isEmpty()) {
                int first = q.poll();
                for (int k1 : d[first].keySet()) {
                    if (!visited[first][k1]) {
                        visited[first][k1] = true;
                        if (visited[k1][k1]) {
                            if (pos[k1] != pos[first] + d[first].get(k1)) {
                                System.out.println("No");
                                return;
                            }
                        } else {
                            visited[k1][k1] = true;
                            pos[k1] = pos[first] + d[first].get(k1);
                        }
                        q.add(k1);
                    }
                }
            }
        }
        System.out.println("Yes");
    }
}
