import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		HashMap mMap = new HashMap();

		String [] s = new String [200000];
		Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = Integer.parseInt(str);

        int index = 0;
        int max = 1;
		for (int i=0; i<n-1; i++) {
			str = scan.nextLine();
			if (mMap.containsKey(str)) {
				int j = (int)mMap.get(str) +1;
				mMap.put(str, j);
				if (max < j) {
					max = j;
				}
			} else {
				mMap.put(str, 1);
			}
		}

        // 2.Map.Entryのリストを作成する
        List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(mMap.entrySet());

        // 3.比較関数Comparatorを使用してMap.Entryの値を比較する(昇順)
        Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
            public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
                // 4. 昇順
                return obj1.getKey().compareTo(obj2.getKey());
            }
        });

        // 5. ループで要素順に値を取得する
        for(Entry<String, Integer> entry : list_entries) {
        	if (entry.getValue() == max) {
            System.out.println(entry.getKey());
        	}
        }

	}

}
