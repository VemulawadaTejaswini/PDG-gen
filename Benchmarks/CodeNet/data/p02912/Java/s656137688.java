
import java.util.*;

public class Main {

    /* チェックリスト
     * 結果はintの範囲を超えていませんか？(必要な時以外はlongを使いましょう)
     * TLEしそうな処理はありませんか？
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] in = sc.nextLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);
        String[] in2 = sc.nextLine().split(" ");
        List<Long> prices = new ArrayList<Long>();
        for(String price : in2){
            prices.add(Long.parseLong(price));
        }
        for(int i = 0;i < m;i++){
            Collections.sort(prices);
            long max = prices.get(prices.size() - 1) / 2;
            prices.set(prices.size() - 1,max);
        }
        long result = 0;
        for(int i = 0;i < prices.size();i++){
            result += prices.get(i);
        }
        System.out.println(result);
    }
}