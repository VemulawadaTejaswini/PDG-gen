import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static int cnt = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] array = new int[length];
		for (int i=0; i<length; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();

		shellSort(array, length);
		
		
	}
	
	public static void insertionSort(int[] array, int length, int interval) {
		for (int i=interval; i<length; i++) {
			int key = array[i];
			int j = i - interval;
			while (j>=0 && key<array[j]) {
				array[j+interval] = array[j];
				j -= interval;
				cnt++;
			}
			array[j+interval] = key;
		}
	}
	
	public static void shellSort(int[] array, int length) {
		List<Integer> intervals = new ArrayList<Integer>();
		for (int i=1; i<length; i=3*i+1) {
			intervals.add(i);
		}
		
		int size = intervals.size();
		
		System.out.println(size);
		
		for (int i=size-1; i>=0; i--) {
			if (i>0) System.out.print(intervals.get(i) + " ");
			else System.out.println(intervals.get(i));
			
			insertionSort(array, length, intervals.get(i));
		}
		
		System.out.println(cnt);
		printArray(array);
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}

