import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
		List<Integer> a = new ArrayList<Integer>();
		a = str.stream()
				.map(Integer::parseInt)
				.collect(Collectors.toList());
//		long sum = a.stream()
//				.mapToInt(Integer::valueOf)
//				.sum();

//		a.stream().forEach(r -> System.out.println(r));
//		System.out.println();
		for(var i = 0; i < m; i++) {
			Collections.sort(a);
			var b = scanner.nextInt();
			var c = scanner.nextInt();
			for(var j = 0; j < b; j++) {
				if (a.get(j) >= c) break;
				a.set(j, Math.max(a.get(j), c));
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
