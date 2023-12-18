import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		HashMap<Character, TreeSet<Integer>> map = new HashMap<>();
		for (int i = 0; i < 10; i++) {
		    map.put((char)(i + '0'), new TreeSet<Integer>());
		}
		for (int i = 0; i < arr.length; i++) {
		    map.get(arr[i]).add(i);
		}
		int count = 0;
		for (int i = 0; i < 10; i++) {
		    TreeSet<Integer> setX = map.get((char)(i + '0'));
		    if (setX.size() == 0) {
		        continue;
		    }
		    Integer x = setX.first();
		    for (int j = 0; j < 10; j++) {
		        TreeSet<Integer> setY = map.get((char)(j + '0'));
		        if (setY.size() == 0) {
		            continue;
		        }
		        Integer y = setY.last();
		        if (x >= y) {
		            continue;
		        }
		        for (int k = 0; k < 10; k++) {
		            Integer z = map.get((char)(k + '0')).higher(x);
		            if (z != null && z < y) {
		                count++;
		            }
		        }
		    }
		}
		System.out.println(count);
	}
}
