
import java.util.*;

public class Main {

    /* チェックリスト
     * 結果はintの範囲を超えていませんか？(必要な時以外はlongを使いましょう)
     * TLEしそうな処理はありませんか？
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String dance = sc.nextLine();
        boolean good = true;
        int i = 1;
        for(char c : dance.toCharArray()){
            if(c == 'R'){
                if(i % 2 == 0){
                    good = false;
                }
            }else if(c == 'L'){
                if(i % 2 != 0){
                    good = false;
                }
            }
            i++;
        }
        System.out.println(good ? "Yes" : "No");
    }
}