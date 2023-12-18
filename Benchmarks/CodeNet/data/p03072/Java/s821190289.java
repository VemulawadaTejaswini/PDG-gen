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
    int[] a = IntStream.range(0, n).map(i -> Integer.parseInt(sc.next())).toArray();
    // List<Integer> a = IntStream.range(0, n).map(i -> Integer.parseInt(sc.next())).boxed().collect(Collectors.toList());
    int solve() {
        int count = 1;
        O:
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if(a[i] < a[j]) {
                    continue O;
                }
            }
            count++;
        }
        
        return count;
    }
}
