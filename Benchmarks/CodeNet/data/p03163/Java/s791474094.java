import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int W = s.nextInt();
        int[] w = new int[n];
        long[] v = new long[n];
        for (int i=0; i<n; i++){
            w[i] =s.nextInt();
            v[i] =s.nextLong();
        }        
        long maxGain = knapsack(w, v, W);
        System.out.println(maxGain);
    }

    private static Long knapsack(int[] w, long[] v, int W) {
        long[][] matrix = new long[w.length + 1][W + 1];

        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < W; j++) {
                matrix[i][j] = 0;
            }
        }

        for (int i = 1; i <= w.length; i++) {
            for (int j = 0; j <= W; j++) {
                int weight = w[i - 1];
                if(weight<=j){
                    matrix[i][j] = Math.max(
                            v[i - 1] + matrix[i - 1][j - weight],
                            matrix[i - 1][j]
                    );
                }else{
                    matrix[i][j]=matrix[i-1][j];
                }

            }
        }
        return matrix[w.length][W];
    }
}