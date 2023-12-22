import java.util.*;

public class Main{

    static int[][] M;
    static int[] R;
    static int[] C;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        M = new int[n][n];
        R = new int[n];/*行 */
        C = new int[n];/*列*/

        for(int i = 0; i < n; i++){
            R[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }
        //System.out.println("Integer.MAX_VALUE = "+Integer.MAX_VALUE);
        /*debug*///long startTime = System.currentTimeMillis(); 
        System.out.println(MCM(0, n-1));
        /*debug*///long endTime = System.currentTimeMillis();
        /*debug*///System.out.println("処理時間：" + (endTime - startTime) + " ms");
    }
    //static int j = 0;
    private static int MCM(int fr, int to){
      //System.out.println("loop:"+(++j));
        if(fr == to) return 0;
        if(M[fr][to] == 0){
            int min = Integer.MAX_VALUE;
            for(int i = fr; i < to; i++){
                int r = MCM(fr, i) + MCM(i+1, to) + (R[fr] * C[i] * C[to]);
                if(r < min) min = r;
            }
            M[fr][to] = min;
        }
        return M[fr][to];
    }
}
