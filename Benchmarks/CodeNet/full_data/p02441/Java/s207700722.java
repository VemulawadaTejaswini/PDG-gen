import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			// Stream 使いたい
			List<Integer> a =  IntStream.range(0, n).mapToObj(x->sc.nextInt()).collect(Collectors.toList());
			int q = sc.nextInt();
			// また Stream 使ってしまった
			IntStream.range(0, q).mapToObj((x) -> {
				int b = sc.nextInt();
				int e = sc.nextInt();
				int k = sc.nextInt();
				return Collections.frequency(a.subList(b, e), k);
			}).collect(Collectors.toList()).forEach(System.out::println);
		}
	}
}
