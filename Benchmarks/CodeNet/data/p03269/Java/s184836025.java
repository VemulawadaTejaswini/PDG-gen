import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        long[][] g = new long[20][20];
        boolean[][] zero = new boolean[20][20];
        for(int i = 0; i < 20; ++i)
            for(int j = 0; j < 20; ++j)
                g[i][j] = -1;
        int s = 0;
        int t = 0;
        int N = 1;
        int M = 0;

        for(int i = 20; i >= 0; --i){
            if((1L << (i + 1)) > L) continue;
            for(int j = 0; j < 20; ++j)
                for(int k = 0; k < 20; ++k)
                    g[j][k] *= 2;
            g[t][t+1] = 1;
            zero[t][t+1] = true;
            ++t;
            ++N;
            M += 2;
            if( ((L & (1L << i))) > 0 ){
                g[s][t] = (L - 1) >> i;
                ++M;
            }
        }



        System.out.println(N + " " + M);
        for(int i = 0; i < N; ++i){
            for(int j = 0; j < N; ++j){
                if(g[i][j] > 0)
                    System.out.println((i + 1) + " " + (j + 1) + " " + g[i][j]);
                if(zero[i][j])
                    System.out.println((i + 1) + " " + (j + 1) + " " + 0);
            }
        }
    }

    void tr(Object...objects){
        System.out.println(Arrays.deepToString(objects));
    }
}