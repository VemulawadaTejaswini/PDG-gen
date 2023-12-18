
import java.util.*;

public class Main {

    /* チェックリスト
     * 結果はintの範囲を超えていませんか？(必要な時以外はlongを使いましょう)
     * TLEしそうな処理はありませんか？
     */
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = Integer.parseInt(s.nextLine());
        String color = s.nextLine();
        System.out.println(a >= 3200 ? color:"red");
    }
}