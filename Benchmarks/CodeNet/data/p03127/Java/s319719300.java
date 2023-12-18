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
    int n = Integer.parseInt(sc.next());
    {sc.nextLine();}
    // int[] a = IntStream.range(0, n).map(i -> Integer.parseInt(sc.next())).toArray();
    // ソートしておく
    List<Integer> a = IntStream.range(0, n)
                                .map(i -> Integer.parseInt(sc.next()))
                                .sorted()
                                .boxed().collect(Collectors.toList());
    
    int solve() {
        // 最小のan以下にはなる
        
        // 最大でもmin(a) これは他から他を引いた余りがmin(a)以下の時
        
        // なるべく小さい差を作ってそれで余りを取る？
        
        // 初期状態で最小 (これより大きい答えにはならない)
        int min = Collections.min(a);
        
        // 均す方法が必要
        // 499 501 1001 なら1になる
        // 499 501 1502 でも1になる
        // 各数を任意の回数繰り返す組み合わせ？
        // 基本的にはmodを取るのだろうが
        Set<Integer> modSet = new TreeSet<>();
        for(int i: a) {
            for(int j: a) {
                int mod = i % j;
                if(mod != 0) {
                    modSet.add(mod);
                }
            }
        }
        
        if(modSet.isEmpty()) {
            return min;
        }
        
        // mod の最小差？ 嘘くさいがこれで一回試す
        List<Integer> modList = new ArrayList<>(modSet);
        if(modList.get(0) == 1) {
            return 1;
        }
        int prev = 0;
        int diff = Integer.MAX_VALUE;
        for(int mod: modList) {
            diff = Math.min(diff, mod - prev);
            prev = mod;
        }
        // 嘘くさい
        return Math.min(diff, min);
    }
    
}


