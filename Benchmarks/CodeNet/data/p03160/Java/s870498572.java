import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        Scanner cin = new Scanner(System.in);
        N = cin.nextInt();
        H = new int[N + 1];
        for (int i = 0; i < N; i++){
            H[i] = cin.nextInt();
        }
        System.out.println(dfs(0));
    }

    int N;
    int[] H;
    //今の場所からのゴールまでの最小コストを返す
    int dfs(int pos) {
        //オーバーしてた場合は、十分大きいコストを返す
        if (pos >= N) return 99999999;
        //ゴールしてたらこれ以上のコストはかからないので、0を返す
        if (pos == N - 1) return 0;
        //途中であれば、1つ進む場合と2つ進む場合を比較し、今後の歩数が少なくて済む方を返す
        int step1 = dfs(pos + 1) + Math.abs(H[pos + 1] - H[pos]);
        int step2 = dfs(pos + 2) + Math.abs(H[pos + 2] - H[pos]);
        return Math.min(step1, step2);
    }
}

