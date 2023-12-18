import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		list.add(1);
		for(int i = 6; i<=n; i*=6) list.add(i);
		for(int i = 9; i <= n; i *= 9) list.add(i);
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(count(n));
	}

	static Map<Integer, Integer> map = new HashMap<>();
	static List<Integer> list = new ArrayList<>();
	public static int count(int n) {
		if(map.containsKey(n)) return map.get(n);
		if(n == 0) return 0;
		int min = n;
		for(int i : list.parallelStream().filter(i -> i <= n).collect(Collectors.toList())) {
			int count = 1;
			count += count(n-i);
			if(min > count) min = count;
		}

		map.put(n, min);
		return min;
	}
}