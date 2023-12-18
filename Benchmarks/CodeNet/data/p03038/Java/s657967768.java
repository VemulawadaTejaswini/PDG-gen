import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner  = new Scanner(System.in);
		scanner.nextInt();
		final var m = scanner.nextInt();
		scanner.nextLine();
		final String line = scanner.nextLine();

		var str = Arrays.asList(line.split(" "));
		LinkedList<Integer> a = new LinkedList<Integer>();
		a = str.stream()
				.map(Integer::parseInt)
				.collect(Collectors.toCollection(LinkedList::new));
		Collections.sort(a);
		Collections.reverse(a);
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(var aa = 0; aa < a.size(); aa++) {
			map.put(a.get(aa), aa);
		}
		for(var i = 0; i < m; i++) {
			var b = scanner.nextInt();
			var c = scanner.nextInt();
			var cnt = 0;
			int size = a.size();
			int start = (map.containsKey(c))? map.get(c) : 0;
			for (var aa = start; aa < size; aa++) {
				if(cnt == b) break;
				int current = a.get(aa);
				if(current < c) {
					a.add(aa, c);
					a.remove(size);
					cnt++;
				}
			}

		}
		var sum = 0l;
		for (var aa : a){
			sum += aa;
		}
		System.out.println(sum);
		scanner.close();
	}

}
