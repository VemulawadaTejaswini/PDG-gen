import java.util.*;
import java.io.*;
public class Main {
	static int n = 0;
	
	public static void bubble_sort(int[] a) {
		int swapCount = 0;
		for (int i = 0; i < n; i++) {
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
			System.out.print(a[i] + " ");
		}
		System.out.println();
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