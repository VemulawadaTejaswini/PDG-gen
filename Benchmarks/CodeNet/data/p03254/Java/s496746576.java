import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		
		quickSort(a);
		
		System.out.println(maxNum(a, x));

	}
	
	public static void quickSort(int[] list) {
		quickSort(list, 0, list.length - 1);
	}
	
	public static void quickSort(int[] list, int first, int last) {
		if (last > first) {
			int pivotIndex = partition(list, first, last);
			quickSort(list, first, pivotIndex - 1);
			quickSort(list, pivotIndex + 1, last);
		}
	}
	
	public static int partition(int[] list, int first, int last) {
		int pivot = list[first];
		int low = first + 1;
		int high = last;
		
		while (high > low) {
			while (low <= high && list[low] <= pivot)
				low++;
			
			while (low <= high && list[high] > pivot)
				high--;
			
			if (high > low) {
				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}
		
		while (high > first && list[high] >= pivot)
			high--;
		
		if (pivot > list[high]) {
			list[first] = list[high];
			list[high] = pivot;
			return high;
		}
		else
			return first;
	}
	
	public static int maxNum(int[] list, int x){
		int index = 0;
		while (x >= list[index]){
			x -= list[index];
			index++;
			if (index == list.length - 1){
				if (x == list[index])
					return list.length;
				else 
					return list.length - 1;
			}
		}
		return index;
	}

}