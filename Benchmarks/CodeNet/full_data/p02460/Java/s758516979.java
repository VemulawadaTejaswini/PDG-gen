import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int times = sc.nextInt();
			Map<String, Long> map = new HashMap<>();
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
				}
			}
		}
	}
}
