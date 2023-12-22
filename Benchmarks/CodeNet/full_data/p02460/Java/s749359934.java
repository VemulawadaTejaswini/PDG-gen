import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Long> map = new TreeMap<>();
		List<Long> out = new ArrayList<>();
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			switch (sc.nextByte()) {
				case 0:
					map.put(sc.next(), sc.nextLong());
					break;
				case 1:
					String str = sc.next();
					if(map.containsKey(str)) {
						out.add(map.get(str));
					}else{
						out.add(0L);
					}
					break;
				case 2:
					map.remove(sc.next());
					break;
			}
		}
		for (long n : out) {
			System.out.println(n);
		}
	}
}

