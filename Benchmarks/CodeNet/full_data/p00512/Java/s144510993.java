import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// map(HashMap)に全データ、list(ArrayList)に商品名を格納
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < n; i++){
			String a = sc.next();
			int b = sc.nextInt();
			if (map.containsKey(a)){
				map.put(a, map.get(a) + b);
			} else {
				map.put(a, b);
				list.add(a);
			}
		}
		sc.close();
		// listのソート
		Collections.sort(list, new CompArray());

		// 出力していく
		for(String a: list){
			System.out.println(a+" "+map.get(a));
		}
	}

	static class CompArray implements Comparator<String>{
		@Override
		public int compare(String s1, String s2){
			// 長さの比較。短い方を持ってくる。
			int l1 = s1.length();
			int l2 = s2.length();
			if (l1 != l2){
				return l1 - l2;
			} else {
			// 長さが同じ場合は文字を比較。若い文字を優先
				for (int i = 0; i < l1; i++){
					char c1 = s1.charAt(i);
					char c2 = s2.charAt(i);
					if (c1 != c2){
						return c1 - c2;
					}
				}
			}
			return 0;
		}
	}
}
