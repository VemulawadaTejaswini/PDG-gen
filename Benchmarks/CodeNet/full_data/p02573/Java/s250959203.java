import java.io.*;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    private static int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        int N = readInt();
        int M = readInt();

        HashSet<Integer>[] adj = new HashSet[N + 1];
        for (int i = 1; i <= N; i++) {
            adj[i] = new HashSet<>();
        }
        for (int i = 0; i < M; i++) {
            int a = readInt();
            int b = readInt();
            adj[a].add(b);
            adj[b].add(a);
        }

        int res = -1;
        boolean[] visited = new boolean[N+1];
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                Stack<Integer> todo = new Stack<>();
                todo.add(i);
                visited[i] = true;
                int count = 1;
                while(!todo.isEmpty())
                {
                    int cur = todo.pop();
                    for(int n : adj[cur]) {
                        if (!visited[n])
                        {
                            visited[n] = true;
                            count++;
                            todo.push(n);
                        }
                    }
                }
                res = Math.max(res, count);
            }
        }

        System.out.println(res);
    }
}
