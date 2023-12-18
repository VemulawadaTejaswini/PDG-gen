import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main { //クラス名はMain
    public static void main(String[] args) {
        //コード
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            String a = sc.nextLine();
            int b = map.get(a);
            map.put(a,b+1);
        }
        // 2.Map.Entryのリストを作成する
        List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(map.entrySet());

        // 3.比較関数Comparatorを使用してMap.Entryの値を比較する(昇順)
        Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
            public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
                // 4. 昇順
                return obj1.getValue().compareTo(obj2.getValue());
            }
        });

        int count=0;
        ArrayList<String> la = new ArrayList<String>();
        // 5. ループで要素順に値を取得する
        for(Entry<String, Integer> entry : list_entries) {
        	if(count > entry.getValue()) {
        		break;
        	}else {
        		la.add(entry.getKey());
        	}
        	count = entry.getValue();
        }
        Collections.sort(la);
        System.out.println(la);
    }
}