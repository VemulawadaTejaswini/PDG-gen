import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int times = sc.nextInt();
			TreeMap<String, Long> map = new TreeMap<>();
			for (int i = 0; i<times; i++){
				int query = sc.nextInt();
				String key = sc.next();
				switch (query) {
				case 0:
					long x = sc.nextLong();
					map.put(key,x);
					break;
				case 1:
					if (map.get(key)!=null) {
						System.out.println(map.get(key));
					} else System.out.println(0);
					break;
				case 2:
					map.remove(key);
					break;
				case 3:
					String large = sc.next();
					SortedMap<String,Long> submap = map.subMap(key,true,large,true);
					for (String s : submap.keySet()) {
						System.out.println(s + " " + submap.get(s));   //回数があるだけ出力
					}
					break;
				}
			}
		}
	}
}
