import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		ArrayList<String> lines = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			String line = in.nextLine();
			lines.add(line);
		}

		// 第一引数取得
		int totalNum = Integer.parseInt(lines.get(0));
		// 第二引数取得、スペース区切りで分割して配列に入れる
		String str = lines.get(1);
		String strs[] = str.split("\\s");

		// nとn+1の配列
		String[] strOne = new String[totalNum/2];
		String[] strTwo = new String[totalNum/2];

		int m = 0;
		int n = 0;
		for(int i=0; i<totalNum; i++) {
			if(i%2 == 0) {
				strOne[m] = strs[i] ;
				m++;
			}else {
				strTwo[n] = strs[i] ;
				n++;
			}
		}

		// ソートと重複数取得用Map生成
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();

		// strOneの配列をMapへ登録、重複カウント
		for (String s : strOne) {
			int v;
			if (map1.containsKey(s)) {
				// Mapに登録済み
				v = map1.get(s) + 1;
			} else {
				// Mapに未登録
				v = 1;
			}
			map1.put(s, v);
		}

		// strTwoの配列をMapへ登録、重複カウント
		for (String s : strTwo) {
			int v;
			if (map2.containsKey(s)) {
				// Mapに登録済み
				v = map2.get(s) + 1;
			} else {
				// Mapに未登録
				v = 1;
			}
			map2.put(s, v);
		}

		// Map.Entryのリストを作成する
		List<Entry<String, Integer>> list_entries1 = new ArrayList<Entry<String, Integer>>(map1.entrySet());
		List<Entry<String, Integer>> list_entries2 = new ArrayList<Entry<String, Integer>>(map2.entrySet());

		// 比較関数Comparatorを使用してMap.Entryの値を比較してソート(降順)
		// nの配列
		Collections.sort(list_entries1, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				// 降順
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});
		// n+1の配列
		Collections.sort(list_entries2, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				// 降順
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});

		int one = list_entries1.get(0).getValue();
		int two = list_entries2.get(0).getValue();

		// 回答
		if(one == totalNum/2 && two == totalNum/2) {
			if(one != two) {
				System.out.println(0);
			}else {
				System.out.println(totalNum/2);
			}
		}else {
			System.out.println(totalNum - (one + two));
		}
	}
}