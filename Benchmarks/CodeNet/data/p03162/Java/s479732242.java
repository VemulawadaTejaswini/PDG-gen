import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Arles
 */
public class Main {

    static Pair[][] vac;
    static int oo = Integer.MAX_VALUE;
    static int[] memo;

    public static int dp(int i, int N) {
        Pair[][] sol = new Pair[N][3];

        for (int j = 0; j < 3; j++) {
            sol[0][j] = vac[0][j];
            //System.out.print(sol[0][j] + "-");
        }
        //System.out.println("");
        for (int fil = 1; fil < N; fil++) {
            for (int col = 0; col < 3; col++) {

                Pair max = new Pair(-1, 0, 0);
                for (int colu = 0; colu < 3; colu++) {
                    if (sol[fil - 1][colu].count < 2 && sol[fil - 1][colu].val > max.val) {
                        max = sol[fil - 1][colu];
                    }
                }
               
               // System.out.println("max: " + max);                
                if (col != max.c) {
                    sol[fil][col] = new Pair(max.val + vac[fil][col].val, col, 1);
                } else {
                    sol[fil][col] = new Pair(max.val + vac[fil][col].val, col, max.count + 1);
                }
                //System.out.println("sol" + sol[fil][col] + ",");
            }
            //System.out.println("");
        }

        int val = Integer.MIN_VALUE;
        for (int col = 0; col < 3; col++) {
            if (sol[N - 1][col].val > val) {
                //System.out.print(sol[N-1][col].val + " ");
                val = sol[N - 1][col].val;
            }
        }
        return val;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        vac = new Pair[N][3];

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                vac[i][j] = new Pair(Integer.parseInt(line[j]), j, 1);
            }
        }

        System.out.println(dp(0, N));

    }

}

class Pair {

    int val;
    int c;
    int count;

    public Pair(int f, int c, int count) {
        this.val = f;
        this.c = c;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Pair{" + "val=" + val + ", c=" + c + ", count=" + count + '}';
    }

}
