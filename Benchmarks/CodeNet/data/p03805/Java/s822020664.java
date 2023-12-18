
import java.util.Scanner;

class Main {

    static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[m];
        int b[] = new int[m];
        int mvMap[][] = new int[n][n];
        for (int i = 0; i < m; i++) {
            // indexになおす
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
            mvMap[a[i]][b[i]] = 1;
            mvMap[b[i]][a[i]] = 1;
        }
        boolean visited[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            visited[i] = false;
        }
        visited[0] = true;
        bfs(0, visited, mvMap);
        System.out.println(ans);

        sc.close();
    }

    static void bfs(int spos, boolean[] visited, int[][] mvMap) {
        int viscnt = 0;
        for (int i = 0; i < visited.length; i++) {
            if (visited[i]) {
                viscnt++;
            }
        }
        if (viscnt == visited.length) {
            ans++;
            return;
        }
        for (int i = 0; i < mvMap.length; i++) {
            if (mvMap[spos][i] == 1 && !visited[i]) {
                // exsits path and not visited
                visited[i] = true;
                bfs(i, visited, mvMap);
                visited[i] = false;
            }
        }
    }
}
