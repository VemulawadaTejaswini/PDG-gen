import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int times = sc.nextInt();
			TreeMap<String, ArrayList<Long>> map = new TreeMap<>();
			for (int i = 0; i<times; i++){
				int query = sc.nextInt();
				String key = sc.next();
				switch (query) {
				case 0:
					long x = sc.nextLong();
					if (map.get(key)==null) map.put(key, new ArrayList<Long>());  //初めは空のArrayListを作成
					map.get(key).add(x);  //ArrayListにxを追加
					break;
				case 1:
					if (map.get(key)!=null) {
						for (Long l : map.get(key))	System.out.println(l);  //ArrayListの中身を全て出力
					}
					break;
				case 2:
					map.remove(key);
					break;
				case 3:
					String large = sc.next();
					SortedMap<String,ArrayList<Long>> submap = map.subMap(key,true,large,true);
					for (String s : submap.keySet()) {
						for (long l : submap.get(s)) {
							System.out.println(s +" " + l);
						}
					}
					break;
				}
			}
		}
	}
}
