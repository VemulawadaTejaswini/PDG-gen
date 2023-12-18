import java.util.*;

public class Main{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [][] A = new int [N][M];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt() - 1;
            }
        }
        System.out.println(calcAns(N,M,A));
    }

    public static int calcAns(int N,int M,int [][] A) {
        int [] c = new int [M];
        int [] x = new int [M];
        for(int i = 0; i < N; i++) {
            c[A[i][0]] += 1;
        }
        int ret = M;
        for(int cnt = 0; cnt < M - 1; cnt++) {
            // most appeared color
            int p = 0;
            for(int i = 1; i < M; i++) {
                if(c[i] > c[p]) {
                    p = i;
                }
            }
            // update ret
            if(c[p] < ret) ret = c[p];
            // delete color p
            c[p] = -1;
            for(int i = 0; i < N; i++) {
                c[A[i][x[i]]] -= 1;
                while(c[A[i][x[i]]] < 0) {
                    x[i] = x[i] + 1;
                }
                c[A[i][x[i]]] += 1;
            }
        }
        return ret;
    }
}
