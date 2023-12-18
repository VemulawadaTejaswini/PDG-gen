import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner  = new Scanner(System.in);
//		final var n = scanner.nextInt();
		scanner.nextInt();
		final var m = scanner.nextInt();
		scanner.nextLine();
		final String line = scanner.nextLine();

		var str = Arrays.asList(line.split(" "));
//		str.stream().forEach(r -> System.out.println(r));
		LinkedList<Integer> a = new LinkedList<Integer>();
		a = str.stream()
				.map(Integer::parseInt)
				.collect(Collectors.toCollection(LinkedList::new));
//		long sum = a.stream()
//				.mapToInt(Integer::valueOf)
//				.sum();

//		a.stream().forEach(r -> System.out.println(r));
//		System.out.println();
		Collections.sort(a);
		Collections.reverse(a);
		for(var i = 0; i < m; i++) {
			var b = scanner.nextInt();
			var c = scanner.nextInt();
//			for(var j = 0; j < b; j++) {
//				if (a.get(j) <= c) break;
//				a.set(j, Math.max(a.get(j), c));
//			}
			var cnt = 0;
			int size = a.size();
			for (var aa = 0; aa < size; aa++) {
				if(cnt == b) break;
				int current = a.get(aa);
				if(current < c) {
					a.add(aa, c);
					a.remove(size);
					cnt++;
				}
			}
//			a.stream().forEach(r -> System.out.println(r));
//			System.out.println("-----" + i);

		}
//		System.out.println(sum);
//		a.stream().forEach(r -> System.out.println(r));
//		sum = Math.max(sum, a.stream().mapToInt(Integer::valueOf).sum());
		var sum = 0l;
		for (var aa : a){
			sum += aa;
		}
		System.out.println(sum);
		scanner.close();
	}

}
