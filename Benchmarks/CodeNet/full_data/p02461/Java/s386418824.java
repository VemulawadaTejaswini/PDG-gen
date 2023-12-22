import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int q = sc.nextInt();
			TreeMap<String, Integer> m = new TreeMap<>();
			for(int i = 0; i < q; i++) {
				int query = sc.nextInt();
				switch(query) {
				case 0:
					m.put(sc.next(), sc.nextInt());
					break;
				case 1:
					System.out.println(m.getOrDefault(sc.next(), 0));
					break;
				case 2:
					m.remove(sc.next());
					break;
				case 3:
					Map<String, Integer> sub = m.subMap(sc.next(), true, sc.next(), true);
					for(Map.Entry<String, Integer> entry: sub.entrySet()) {
						System.out.println(String.format("%s %d", entry.getKey(), entry.getValue()));
					}
					break;
				}
			}
		}
	}
}
