import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			String[] s = new String[n];
			for(int i = 0 ; i < n ; i++) {
				s[i] = sc.next();
			}
			TreeMap<String, Integer> map = new TreeMap<>();
			Arrays.stream(s).forEach(value -> {
				map.put(value, map.getOrDefault(value, 0) + 1);
			});
			int max = 0;
			PriorityQueue<String> maxList = new PriorityQueue<>();
			for(Map.Entry<String, Integer> entry : map.entrySet()) {
				if(entry.getValue() > max) {
					maxList.clear();
					maxList.add(entry.getKey());
					max = entry.getValue();
				} else if(entry.getValue() == max) {
					maxList.add(entry.getKey());
				}
			}
			maxList.stream().forEach(System.out::println);
		}

	}

}
