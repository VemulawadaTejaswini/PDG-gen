import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		int[] sortedArray = Arrays.copyOf(array, array.length);
		Arrays.sort(sortedArray);
		
		// put in the hash table
		Map <Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < sortedArray.length; i++) {
			map.put(sortedArray[i], i);
		}
		
		// check how many are in the same parity
		int counter = 0;
		for (int j = 0; j < array.length; j++) {
			if ((map.get(array[j]) % 2) != (j % 2) && array[j] != sortedArray[j]) {
				counter++;
			}
		}
		
		System.out.println(counter/2);
		
	}
}