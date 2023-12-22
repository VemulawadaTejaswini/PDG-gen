import java.util.*;
import java.io.*;
public class Main {
	static int n = 0;
	
	public static void bubble_sort(int[] a) {
		int swapCount = 0;
		for (int i = 0; i < n; i++) {
			
			// search for unsorted pairs from the back
			for (int j = n-1; j > i; j--) {
				if (a[j] < a[j-1]) {
					
					// swap a[j], a[j-1]
					int tmp = a[j];
					a[j] = a[j-1];
					a[j-1] = tmp;
					
					// increase swapCount
					swapCount++;
				}
			}
			
			// print sorted elements
			if (i < n-1) System.out.print(a[i] + " "); 
			else
				System.out.println(a[i]);
		}
		
		// print swapCount on a new line
		System.out.println(swapCount);
	}
	
	public static void main (String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) 
			a[i] = sc.nextInt();
		bubble_sort(a);
	}
}