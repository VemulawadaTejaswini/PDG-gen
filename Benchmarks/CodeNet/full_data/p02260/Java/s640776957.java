import java.util.*;
import java.io.*;
public class Main {
	static int n = 0;
	
	public static void selection_sort(int[] a) {
		
		// init swap count
		int swapCount = 0;
		
		// start from left to right
		for (int i = 0; i < n; i++) {
			
			// find the ith minimum element
			
				// assume that a[i] is the minimum value
				int min_index = i;
				
				// search for values that are smaller than minimum value
				for (int j = i+1; j < n; j++) {
					if (a[j] < a[min_index])
						min_index = j;
				}
				
			// put that element in the right place (ith position) & increase swapCount
			int tmp = a[min_index];
			a[min_index] = a[i];
			a[i] = tmp;
			
			if (min_index != i) swapCount++;
				
			// print sorted elements
			if (i < n-1) System.out.print(a[i] + " "); 
			else
				System.out.println(a[i]);
		}
		System.out.println(swapCount);
	}
	
	public static void main (String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) 
			a[i] = sc.nextInt();
		selection_sort(a);
	}
}