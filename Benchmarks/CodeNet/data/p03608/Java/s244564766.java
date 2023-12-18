import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = 1 << 61;

    static int n,m,r;
    static int[] R;
    static long[][] dist;
    static long ans = inf;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        r = in.nextInt();
        R = new int[r];
        for(int i = 0; i < r; i++) R[i] = in.nextInt()-1;

        visited = new boolean[r];
        Arrays.fill(visited, false);

        dist = new long[n][n];
        for(int i = 0; i < n; i++) {
            Arrays.fill(dist[i], inf);
            dist[i][i] = 0;
        }
        for(int i = 0; i < m; i++) {
            int a = in.nextInt()-1;
            int b = in.nextInt()-1;
            int c = in.nextInt();
            dist[a][b] = c;
            dist[b][a] = c;
        }

        for(int k = 0; k < n; k++) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    dist[i][j] = Math.min(dist[i][k] + dist[k][j], dist[i][j]);
                }
            }
        }

        //dfsWithRecursion(1, -1, 0);
        ans = dfsWithStack();

        print(ans);
    }


    static void dfsWithRecursion(int cnt, int last, long d) {
        if(cnt == r+1) {
            ans = Math.min(ans, d);
            return;
        }

        for(int i = 0; i < r; i++) {
            if(!visited[i]) {
                visited[i] = true;
                if(last == -1) dfsWithRecursion(cnt+1, i, 0);
                else           dfsWithRecursion(cnt+1, i, d + dist[R[last]][R[i]]);
                visited[i] = false;
            }
        }
    }

    static long dfsWithStack() {
        long ans = inf;

        for(int j = 0; j < r; j++) {
            int rj = R[j];

            Stack<Tuple3> stack = new Stack<>();
            boolean[] used = new boolean[9];

            stack.push(new Tuple3(rj, 1, 0));
            while(!stack.isEmpty()) {
                Tuple3 current = stack.pop();
                int x = current.x;
                int y = current.y;
                long z = current.z;

                if(y == r) {
                    ans = Math.min(ans, z);
                }

                used[x] = true;
                for(int i = 0; i < r; i++) {
                    int ri = R[i];
                    if(!used[ri]) {
                        stack.push(new Tuple3(ri, y + 1, z + dist[x][ri]));
                    }
                }
            }
        }

        return ans;
    }

    static void print(String s) {
        System.out.println(s);
    }

    static void print(int i) {
        System.out.println(i);
    }

    static void print(long i) {
        System.out.println(i);
    }
}

class P {
    int x, y;
    P(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class E {
    int from, to;
    long w;
    E(int from, int to, long w) {
        this.from = from;
        this.to = to;
        this.w = w;
    }
}

class Tuple3 {
    int x, y;
    long z;
    Tuple3(int x, int y, long z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}