import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void printArray(List<Integer> array) {
		StringBuilder sb = new StringBuilder();
		sb.append(array.get(0));
		for (int j = 1; j < array.size(); j++) {
			sb.append(" ").append(array.get(j));
		}
		System.out.println(sb.toString());
	}

	static public List<Integer> acceptArray (InputStream ins) {
		Scanner sc = new Scanner(ins);
		int num = sc.nextInt();
		List<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < num; i++) {
			array.add(sc.nextInt());
		}
		return array;
	}

	static public List<Integer> bubbleSort (List<Integer> array) {
		// 1, 2,4,5,3
		//
		int swapCount = 0;
		for (int i = 0; i < array.size()-1; i++){
			for (int j = array.size()-1; j > i; j--) {
				if (array.get(j-1) > array.get(j)) {
					//swap
					int c = array.get(j);
					array.set(j, array.get(j-1));
					array.set(j-1, c);
					swapCount++;
				}
			}

		}
		printArray(array);
		System.out.println(swapCount);
		return array;
	}

	static public void main(String[] args) {
		List<Integer> array = acceptArray(System.in);
		List<Integer> sorted = bubbleSort(array);

	}
}