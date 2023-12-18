import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.next();
		Map<String, Integer> map = new HashMap<>();
		while (sc.hasNext()) {
			char[] array = sc.nextLine().toCharArray();
			Arrays.sort(array);
			String input = String.valueOf(array);
			Integer integer = map.getOrDefault(String.valueOf(array), 0);
			map.put(input, integer++);
		}
		for (Integer value : map.values()) {
			long v = value - 1;
			System.out.println(v * (v - 1l) / 2l);
		}
	}
}
