import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Main().solve());
    }
    
    // パラメタ渡しもちゃんとクラス作るのも面倒なので手抜き
    // 必要な値はここで全部取ってしまう
    Scanner sc = new Scanner(System.in);
    // 人数
    int n = Integer.parseInt(sc.next());
    // 種類
    int m = Integer.parseInt(sc.next());
    {sc.nextLine();}
    int[][] a = new int[n][];
    {
        // a[0]は使わない
        for(int i = 0; i < n; i++) {
            int k = Integer.parseInt(sc.next());
            a[i] = new int[k];
            for(int j = 0; j < k; j++) {
                a[i][j] = Integer.parseInt(sc.next());
            }
        }
    }
    
    String solve() {
        List<Integer> foods = IntStream.rangeClosed(1, m).boxed().collect(Collectors.toList());
        
        // 全員に共通する要素の数を出力
        for(int[] aa: a) {
            foods.retainAll(IntStream.of(aa).boxed().collect(Collectors.toList()));
        }
        return ""+foods.size();
    }
    
}


