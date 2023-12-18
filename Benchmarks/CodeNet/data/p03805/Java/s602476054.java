import java.util.Scanner;
import java.util.Arrays;

class Main {
    static boolean[] visited;
    static int n;
    static int m;
    static int[] a;
    static int[] b;
    static long ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[m];
        b = new int[m];
        visited = new boolean[n + 1];
        Arrays.fill(visited, false);
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        sc.close();
        ans = 0;
        DFS(1);
        System.out.println(ans);
    }

    public static void DFS(int pos) {
        visited[pos] = true;
        boolean comp = true;
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                comp = false;
                break;
            }
        }
        if (comp) {
            ans++;
            visited[pos] = false;
            return;
        }
        for (int i = 0; i < m; i++) {
            if (pos == a[i] && !visited[b[i]]) {
                DFS(b[i]);
            }
        }
        for (int i = 0; i < m; i++) {
            if (pos == b[i] && !visited[a[i]]) {
                DFS(a[i]);
            }
        }
        visited[pos] = false;
        return;
    }
}