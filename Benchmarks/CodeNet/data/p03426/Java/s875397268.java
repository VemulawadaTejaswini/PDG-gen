import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        int D = sc.nextInt();
        int[][] A = new int[H][W];
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int Q = sc.nextInt();
        int[] L = new int[Q];
        int[] R = new int[Q];
        for(int i = 0; i < Q; i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }

        Map<Integer,Integer> Ax = new HashMap<>();
        Map<Integer,Integer> Ay = new HashMap<>();

        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                Ax.put(A[i][j], j);
                Ay.put(A[i][j], i);
            }
        }

        int[] cost = new int[H * W + 1];
        for(int i = 1; i <= H * W; i++) {
            if(i + D > H * W) continue;
            int costTmp = Math.abs(Ax.get(i + D) - Ax.get(i)) + Math.abs(Ay.get(i + D) - Ay.get(i));
            cost[i + D] = costTmp + cost[i];
        }

        for(int i = 0; i < Q; i++) {
            System.out.println(cost[R[i]] - cost[L[i]]);
        }
        
    }
}