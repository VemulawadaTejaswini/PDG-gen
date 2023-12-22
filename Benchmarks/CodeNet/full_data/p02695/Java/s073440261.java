import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n = 0;
    static int m = 0;
    static int q = 0;
    static int[] a = null;
    static int[] b = null;
    static int[] c = null;
    static int[] d = null;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        q = in.nextInt();
        a = new int[q];
        b = new int[q];
        c = new int[q];
        d = new int[q];
        for(int i=0; i<q; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            c[i] = in.nextInt();
            d[i] = in.nextInt();
        }
        
        int[] A = new int[n];
        int score = dfs(A, 0);
        System.out.println(score);
    }
    private static int dfs(int[] A, int nextIndex) {
        if(nextIndex > n-1) {
            return eval(A);
        }
        int lastVal = 1;
        if(nextIndex > 0) {
            lastVal = A[nextIndex-1];
        }
        int maxScore = 0;
        for(int i=lastVal; i<=m; i++) {
            int[] clone = Arrays.copyOf(A, A.length);
            clone[nextIndex] = i;
            int score = dfs(clone, nextIndex+1);
            maxScore = Math.max(maxScore, score);
        }
        return maxScore;
    }
    private static int eval(int[] A) {
        int score = 0;
        for(int i=0; i<q; i++) {
            if(A[b[i]-1] - A[a[i]-1] == c[i]) {
                score += d[i];
            }
        }
        return score;
    }
}
