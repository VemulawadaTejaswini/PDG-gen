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
	public static List<Integer> insertSort (List<Integer> baseArray) {
		printArray(baseArray);
		for (int i = 1; i < baseArray.size(); i++) {
			int key = baseArray.get(i);
			int j = i - 1;
			while (j >= 0 && baseArray.get(j) > key) {
				baseArray.set(j + 1, baseArray.get(j));
				j--;
			}
			baseArray.set(j + 1, key);
			//System.out.println("Processing array=" + baseArray);
			printArray(baseArray);
		}
		return baseArray;
	}

	public static void solve (InputStream ins) {
		Scanner sc = new Scanner(ins);
		int num = sc.nextInt();
		List<Integer> baseArray = new ArrayList<Integer>();
		for (int i = 0; i  < num; i++) {
			baseArray.add(sc.nextInt());
		}
		insertSort(baseArray);
	}

	public static void main (String[] args) {
		solve(System.in);
	}
}