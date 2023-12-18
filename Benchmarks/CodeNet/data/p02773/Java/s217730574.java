import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void maxNoOfString(TreeMap<String, Integer> trr, Object[] keys) {
		int max = trr.get(keys[0]);
		for (int count = 1; count < keys.length; count++) {
			if(trr.get(keys[count]) > max) max = trr.get(keys[count]);
		}
		getKey(trr, max);
	}
	
	public static void getKey(TreeMap<String, Integer> trr, Integer value) {
		for (String key : trr.keySet()) {
			if(value.equals(trr.get(key))) System.out.println(key);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt(); scan.nextLine();
		TreeMap<String, Integer> trr = new TreeMap<>();
		for (int count = 0; count < t; count++) {
			String str = scan.nextLine();
			if(trr.containsKey(str)) trr.put(str, trr.get(str) + 1);
			else trr.put(str, 1);
		}
		maxNoOfString(trr, trr.keySet().toArray());
		scan.close();
	}
}