import java.util.Scanner;

public class Main {

    int N;
    int x = 1, ans = 0;
    boolean[][] rinsetsu;
    boolean[] already;

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        rinsetsu = new boolean[N][N];
        already = new boolean[N];
        already[0] = true;
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            rinsetsu[a][b] = true;
            rinsetsu[b][a] = true;
        }
        bfs(0);
        System.out.println(ans);
    }

    void bfs(int parent) {
        if (x == N) {
            ans++;
            return;
        }
        x++;
        for (int i = 0; i < N; i++) {
            if (!already[i] && rinsetsu[parent][i]) {
                already[i] = true;
                bfs(i);
                already[i] = false;
            }
        }
        x--;
    }
}
