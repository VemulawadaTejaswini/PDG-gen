import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int R = sc.nextInt();
		sc.nextLine();
		String[] arrayR = sc.nextLine().split(" ");
		HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<Integer, HashMap<Integer,Integer>>(N);
		for (int i = 0; i < M; i++) {
			int fromI = sc.nextInt();
			int toI = sc.nextInt();
			int Ci = sc.nextInt();
			if (fromI < toI) {
				if (map.get(fromI) != null) {
					map.get(fromI).put(toI, Ci);
				} else {
					HashMap<Integer, Integer> subMap = new HashMap<Integer, Integer>();
					subMap.put(toI, Ci);
					map.put(fromI, subMap);
				}
			} else {
				if (map.get(toI) != null) {
					map.get(toI).put(fromI, Ci);
				} else {
					HashMap<Integer, Integer> subMap = new HashMap<Integer, Integer>();
					subMap.put(fromI, Ci);
					map.put(toI, subMap);
				}
			}
		}
		sc.close();
		int[] array = new int[R];
		int count = 0;
		for (int i = 0; i < R - 1; i++) {
			HashMap<Integer, Integer> subMap = map.get(Integer.valueOf(arrayR[i]));
			int minLen = 1000000;
			if (subMap.get(i + 1) != null) {
				minLen = subMap.get(i + 1);
			}
//			for (int j = i + 2; j <= Integer.valueOf(arrayR[i + 1]); j--) {
//				if () {
//					
//				}
//			}
			array[count++] = minLen;
		}
		Arrays.sort(array);
		int result = 0;
		for (int i = 0; i < count - 2; i++) {
			result += array[i];
		}
		System.out.println(result);
	}
}