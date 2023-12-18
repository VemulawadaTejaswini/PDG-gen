import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int[][] D = new int[C][C];
        //int[][] c = new int[N][N];
        int[] remain0 = new int[C];
        int[] remain1 = new int[C];
        int[] remain2 = new int[C];
        for(int row=0;row<C;row++){
            for(int col=0;col<C;col++){
                D[row][col] = sc.nextInt();
            }
        }
        // /*记得从小c去找D时要把小c的值-1*/
        for(int row=0;row<N;row++){
            for(int col=0;col<N;col++){
                int nxt = sc.nextInt()-1;
                //c[row][col] = nxt-1; // 0<=c<=C-1
                if((row+col)%3==0) remain0[nxt]++;
                else if((row+col)%3==1) remain1[nxt]++;
                else remain2[nxt]++;
            }
        }
        long[][] cost = new long[3][C];
        for(int i=0;i<C;i++){
            long sum0 = 0;
            for (int r0 = 0; r0 < C; r0++) {
                sum0 += remain0[r0] * (D[r0][i]);
            }
            cost[0][i] = sum0;
        }
        for(int j=0;j<C;j++){
            long sum0 = 0;
            for (int r0 = 0; r0 < C; r0++) {
                sum0 += remain1[r0] * (D[r0][j]);
            }
            cost[1][j] = sum0;
        }
        for(int k=0;k<C;k++){
            long sum0 = 0;
            for (int r0 = 0; r0 < C; r0++) {
                sum0 += remain2[r0] * (D[r0][k]);
            }
            cost[2][k] = sum0;
        }
        long ans = Long.MAX_VALUE;
        for(int i=0;i<C;i++) { // target color for remain0
            for (int j = 0; j < C; j++) { // target color for remain1
                if (j == i) continue;
                for (int k = 0; k < C; k++) { // target color for remain2
                    if (k == i || k == j) continue;
                    long sum0 = cost[0][i];
                    long sum1 = cost[1][j];
                    long sum2 = cost[2][k];
                    ans = Math.min(ans, sum0 + sum1 + sum2);
                }
            }
        }
        System.out.println(ans);
    }
}