import java.util.*;
import java.math.BigDecimal;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    //scanner
        // 数値受付
        int n = sc.nextInt();   // 1<= n,l <=100
        int l = sc.nextInt();
        // 文字列受付
        String s;
        ArrayList<String> sl = new ArrayList<String>(); // 文字列リスト
        for(int i=0;i<n;i++){
            s = sc.next();
            sl.add(s);  // リストに文字列を追加
        }
        // ソート
        Collections.sort(sl);
        // 出力文字列作成
        String ans = "";
        for(String str : sl){
            ans += str;
        }
        // 出力
        System.out.println(ans);    // output
    }
}