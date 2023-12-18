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
            if (map.containsKey(a)){
            	map.put(a,map.get(a)+1);
            }else{
            	map.put(a,1);
            }

        }
        // 2.Map.Entryのリストを作成する
        List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(map.entrySet());

        // 6. 比較関数Comparatorを使用してMap.Entryの値を比較する（降順）
        Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
            //compareを使用して値を比較する
            public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2)
            {
                //降順
                return obj2.getValue().compareTo(obj1.getValue());
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
        for(int i=0;i<la.size();i++){
			System.out.println(la.get(i));
		}
    }
}