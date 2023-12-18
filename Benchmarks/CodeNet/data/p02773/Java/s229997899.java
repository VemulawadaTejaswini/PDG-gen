import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<String> set = new HashSet<String>();

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		int max = 1;
		for (int i = 0; i < N; i++) {
			String tmp = sc.next();
			if (map.containsKey(tmp)) {
				map.replace(tmp, (int)map.get(tmp) + 1);
				if (max < (int)map.get(tmp)) max = (int)map.get(tmp);
			} else {
				map.put(tmp, 1);
			}
		}

		 for (String item : map.keySet()) {
			if (max == map.get(item)) set.add(item);
		}

		 String output[] = new String[set.size()];
		 set.toArray(output);
		 Arrays.sort(output);

		 for (int i = 0; i < set.size(); i++) {
			 System.out.println(output[i]);
		 }
	}
}