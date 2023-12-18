import java.util.*;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Integer[] A = new Integer[M];
        for (int i = 0; i < M; i++) A[i] = sc.nextInt();

        solver(N, M, A);
    }

    public static void solver(int N, int M, Integer[] A) {
        int[] need_matchstick = {-1, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        // Aを数字が大きい順番に並べ替える。同じマッチ数が必要でも数字が大きいものを優先するため
        Arrays.sort(A, Collections.reverseOrder());

        // ちょうどi本のマッチ棒を利用するときの整数の桁数を最大値を動的計画法で計算
        // 桁数を先に求めて、その桁数を満たす整数は後で求める
        int[] digits = new int[N+1];
        Arrays.fill(digits, -1);
        digits[0] = 0;

        for(int n = 1; n <= N; n++){
            for(int a : A){
                int need = need_matchstick[a];
                if(n - need >= 0 && digits[n - need] != -1) {
                    digits[n] = Math.max(digits[n - need] + 1, digits[n]);
                }
            }
        }
        //out.println(Arrays.toString(digits));

        // 桁数を満たす整数を求める
        String numStr = "";
        int rest = digits[N];
        int match = N;
        //out.println(rest);

        while(rest > 0){
            for(int a : A){
                int need = need_matchstick[a];
                //out.println(rest+","+a+","+need);

                if(match >= need && rest - digits[match - need] == 1){
                    numStr += String.valueOf(a);
                    rest --;
                    match -= need;
                    break;
                }
            }

            //try {
            //    Thread.sleep(1000);
            //} catch(InterruptedException e){
            //    e.printStackTrace();
            //}
        }
        out.println(numStr);
    }
}