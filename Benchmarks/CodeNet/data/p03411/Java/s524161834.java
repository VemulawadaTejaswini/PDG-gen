import java.util.*;
public class Main {
    static class Pos {
        int x;
        int y;
        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// get a integer
		int N = sc.nextInt();
        Pos[] a = new Pos[N];
        Pos[] b = new Pos[N];

        for (int i = 0; i < N; i++) {
            a[i] = new Pos(sc.nextInt(), sc.nextInt());
        }
        for (int i = 0; i < N; i++) {
            b[i] = new Pos(sc.nextInt(), sc.nextInt());
        }
        
        boolean[][] d = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((a[i].x < b[j].x) && (a[i].y < b[j].y)) {
                    d[i][j] = true;
                }
            }
        }
        System.out.println(maxBPM(N, d));
    }
    
    static int maxBPM(int N, boolean d[][]) {
        int matchR[] = new int[N];
        for (int i = 0; i < N; i++) {
            matchR[i] = -1;
        }
        int res = 0;
        for (int u = 0; u < N; u++) {
            boolean seen[] = new boolean[N];
            for (int i = 0; i < N; i++) {
                seen [i] = false;
            }
            if (bpm(N, d, u, seen, matchR)) {
                res += 1;
            }
        }
        return res;
    }
    static boolean bpm(int N, boolean d[][], int u, boolean seen[], int matchR[]) {
        for (int v = 0; v < N; v++) {
            if (!seen[v] && d[u][v]) {
                seen[v] = true;
                if (matchR[v] < 0 || bpm(N, d, matchR[v], seen, matchR)) {
                    matchR[v] = u;
                    return true;
                }
            }   
        }
        return false;
    }
}