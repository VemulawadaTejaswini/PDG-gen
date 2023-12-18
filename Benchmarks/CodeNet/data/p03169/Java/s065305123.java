import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // int[] a = new int[N];
        int x=0;
        int y=0;
        int z=0;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if (a == 1) {
                x++;
            } else if(a == 2) {
                y++;
            } else if(a == 3) {
                z++;
            }
        }
        double[][][] dp = new double[N+6][N+6][N+6];

        LinkedList<State> queue = new LinkedList<>();
        queue.offerLast(new State(0,0,0));
        int[][][] inDegree = new int[N+6][N+6][N+6];
        for(int i = 0; i < N+6; i++) {
            for(int j = 0; j < N+6; j++) {
                for (int k = 0; k < N+6; k++) {
                    inDegree[i][j][k] = calcInDegree(i, j, k);
                }
            }
        }

        while(queue.size() > 0) {
            State v = queue.pollFirst();
            int s = v.sum();
            if (s != 0) {
                dp[v.x][v.y][v.z] += ((double) N)/s;
            }
            if(s < N) {
                dp[v.x + 1][v.y][v.z] += (dp[v.x][v.y][v.z] * (v.x + 1))/(s + 1);
                if(--inDegree[v.x+1][v.y][v.z] == 0) {
                    queue.offerLast(new State(v.x+1,v.y,v.z));
                }
            }
            if(v.x > 0) {
                dp[v.x-1][v.y+1][v.z] += (dp[v.x][v.y][v.z] * (v.y + 1))/s;
                if(--inDegree[v.x-1][v.y+1][v.z] == 0) {
                    queue.offerLast(new State(v.x-1,v.y+1,v.z));
                }
            }
            if (v.y > 0) {
                dp[v.x][v.y - 1][v.z + 1] += (dp[v.x][v.y][v.z] * (v.z + 1)) / s;
                if (--inDegree[v.x][v.y - 1][v.z + 1] == 0) {
                    queue.offerLast(new State(v.x, v.y - 1, v.z + 1));
                }
            }
            if (v.x > N+3) break;
        }

        double ans = dp[x][y][z];
        System.out.println(ans);
    }
    public static int calcInDegree(int x, int y, int z) {
        int ans = 0;
        ans += x > 0 ? 1 : 0;
        ans += y > 0 ? 1 : 0;
        ans += z > 0 ? 1 : 0;
        return ans;
    }
    public static class State {
        public int x;
        public int y;
        public int z;

        public State(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public int sum(){
            return this.x + this.y + this.z;
        }
    }
}