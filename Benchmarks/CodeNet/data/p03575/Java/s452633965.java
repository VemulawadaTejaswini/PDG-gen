import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    int N, M;
    boolean graph[][] = new boolean[50][50];
    boolean visited[] = new boolean[50];
    int a[] = new int[50];
    int b[] = new int[50];

    public static void main(String[] args) {
        new Main().solve();
    }

    void dfs(int v) {
        visited[v] = true;
        for (int v2 = 0; v2 < N; v2++) {
            if (graph[v][v2] == false) {
                continue;
            }
            if (visited[v2] == true) {
                continue;
            }
            dfs(v2);
        }
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            a[i]--;
            b[i]--;
            graph[a[i]][b[i]] =graph[b[i]][a[i]] = true;
        }
        int ans = 0;
        for (int i = 0; i < M; i++) {
            graph[a[i]][b[i]] = graph[b[i]][a[i]] = false;
            for (int j = 0; j < N; j++) {
                visited[j] = false;
            }
            dfs(0);
            boolean judge = false;
            for (int j = 0; j < N; j++) {
                if (visited[j] == false) {
                    judge = true;
                }
            }
            if (judge) {
                ans++;
            }
            graph[a[i]][b[i]] = graph[b[i]][a[i]] = true;
        }
        System.out.println(ans);
    }

}
