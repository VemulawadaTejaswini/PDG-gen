import java.util.*;
import java.util.stream.*;
import java.util.function.*;


class Store{
    // 円
    long a;
    // 本
    int b;
    public Store(long a, int b) {
        this.a = a;
        this.b = b;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Main().solve());
    }
    
    // パラメタ渡しもちゃんとクラス作るのも面倒なので手抜き
    // 必要な値はここで全部取ってしまう
    Scanner sc = new Scanner(System.in);
    // 店
    int n = Integer.parseInt(sc.next());
    // 本数
    int m = Integer.parseInt(sc.next());
    
    List<Store> stores = IntStream.range(0, n)
                .mapToObj(i -> new Store(Integer.parseInt(sc.next()), Integer.parseInt(sc.next())) )
                .sorted((s1, s2) -> (int)(s1.a - s2.a))
                .collect(Collectors.toList());
    
    long solve() {
        long result = 0L;
        int count = 0;
        
        for(Store s: stores) {
            if(count + s.b < m) {
                count += s.b;
                result += s.a * s.b;
            } else {
                result += s.a * (m - count);
                break;
            }
        }
        
        return result;
    }
    
}
