import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    /**
     * 整数K
     */
    private static int K;
 
    /**
     * ある町へ転送するテレポータが設置されている町のリスト
     */
    private static List<List<Integer>> vec = new ArrayList<>();
 
    /**
     * 転送先を変えなければならないテレポータの数
     */
    private static int ans = 0;
 
    public static void main(String args[]) {
        //スタックサイズ2^23で処理を行う
        new Thread(null, () -> {
            //try-with-resources文(カッコ内で宣言した変数はtry句を抜けると自動的に閉じられる)
            try (Scanner sc = new Scanner(System.in)) {
                int n = sc.nextInt();
                K = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    vec.add(new ArrayList<>());
                }
                for (int i = 0; i < n; i++) {
                    int a = sc.nextInt() - 1;
                    if (i != 0) {
                        vec.get(a).add(i);
                    } else if (a != 0) {
                        ans++;
                    }
                }
            }
 
            dfs(0, 0);
            System.out.println(ans);
        }, "", 1 << 23).start();
    }
 
    /**
     * 転送回数を算出する
     *
     * @param v   着目する町
     * @param pre 1つ前の町
     * @return 転送回数
     */
    private static int dfs(int v, int pre) {
        int height = 0;
 
        //拡張for文(リストや配列から要素を1つずつ取り出す)
        for (int j : vec.get(v)) {
            height = Math.max(height, dfs(j, v));
        }
 
        if (pre != 0 && height == K - 1) {
            height = 0;
            ans++;
        } else {
            height++;
        }
 
        return height;
    }
}