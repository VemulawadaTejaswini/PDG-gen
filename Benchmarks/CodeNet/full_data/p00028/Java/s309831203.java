import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		TreeMap<Integer,Integer> treeMap = new TreeMap<Integer,Integer>();
		Scanner scan = new Scanner(System.in);
		int max = 0;

		while(scan.hasNext()) {
			int count = 1;
			Integer input = scan.nextInt();

			if(treeMap.containsKey(input)) {
				count += treeMap.get(input);
			}

			if(max < count) {
				max = count;
			}
			treeMap.put(input, count);
		}

		for(int key : treeMap.keySet()) {
			if(max == treeMap.get(key)) {
				System.out.println(key);
			}
		}
		scan.close();

	}

}

