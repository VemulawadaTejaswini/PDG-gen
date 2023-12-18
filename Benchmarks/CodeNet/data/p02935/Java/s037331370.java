
import java.util.*;

public class Main {

    /* チェックリスト
     * 結果はintの範囲を超えていませんか？(必要な時以外はlongを使いましょう)
     * TLEしそうな処理はありませんか？
     */
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = Integer.parseInt(s.nextLine());
        String[] sa = s.nextLine().split(" ");
        List<Float> list = new ArrayList<Float>();
        for(String in : sa){
            list.add(Float.valueOf(in));
        }
        for(int i = 0;i < a - 1;i++){
            Collections.sort(list);
            float x = list.get(0);
            float y = list.get(1);
            list.remove(0);
            list.remove(0);
            list.add((x+y)/2);
        }
        System.out.println(list.get(0));
    }
}