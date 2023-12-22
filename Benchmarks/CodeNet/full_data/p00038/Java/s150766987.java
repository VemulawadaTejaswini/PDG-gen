import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	while (in.hasNext()) {
	 String[] line = in.next().split(",");
	 SortedMap<Integer, Integer> cards = new TreeMap<Integer, Integer>();
	 for (String s : line) {
		Integer key = Integer.valueOf(s);
		int count = 1;
		if (cards.containsKey(key)) {
		 count += cards.get(key).intValue();
		}
		cards.put(key, Integer.valueOf(count));
	 }
	 if (cards.containsValue(Integer.valueOf(4))) {
		System.out.println("four card");
	 } else {
		boolean hasThree =
		  (cards.containsValue(Integer.valueOf(3)));
		boolean hasPeir =
		  (cards.containsValue(Integer.valueOf(2)));
		if (hasThree) {
		 System.out.println(
			 (hasPeir) ? "full house" : "three card");
		} else if (hasPeir) {
		 System.out.println(
			 (cards.keySet().size() == 3) ?
			   "two pair" : "one pair");
		} else {
		 int firstKey = cards.firstKey().intValue();
		 int lastKey = cards.lastKey().intValue();
		 if (lastKey - firstKey == 4 ||
			 (firstKey == 1 && cards.tailMap(10).size() == 4)) {
			System.out.println("straight");
		 } else {
			System.out.println("null");
		 }
		}
	 }
	}
 }
}