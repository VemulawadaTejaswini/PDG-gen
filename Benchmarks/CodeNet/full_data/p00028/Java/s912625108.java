import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

		Scanner scan = new Scanner(System.in);

		int max = 0;
		while(scan.hasNext()) {
			Integer input = scan.nextInt();
			Integer count = 1;

			if(map.containsKey(input)) count += map.get(input);
			if(max < count) max = count;
			map.put(input, count);
		}

		for(Integer key : map.keySet()) {
			int count = map.get(key);
			if(max == count) {
				System.out.println(key);
			}
		}

		scan.close();
	}

}

