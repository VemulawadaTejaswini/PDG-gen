import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }


    void run() {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int K = cin.nextInt();
        System.out.println(dfs(N, K, 1));
    }

    // 残り回数、K、今の値を引数に持ち、この状態からの最小値を返す。
    int dfs(int remain, int K, int now){
        if(remain == 0) return now; //残り回数が0であれば、nowをそのまま返す。
        //残り回数が残っていれば、残り回数を1減らし、2倍したパターンと、Kを足したパターンの最小値を返す
        return Math.min(dfs(remain-1, K, now*2), dfs(remain-1, K, now + K));
    }
}
