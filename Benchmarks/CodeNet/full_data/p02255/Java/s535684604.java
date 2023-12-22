import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for(int i = 0; i < n; ++i)
			a[i] = Integer.parseInt(sc.next());
		printArray(a);
		insertionSort(a);
	}
	
	public static void printArray(int[] a){
		int n = a.length;
		for(int i = 0; i < n; ++i){
			if(i != 0) System.out.print(" ");
			System.out.print(a[i]);
		}
		System.out.println();
	}
	
	public static void insertionSort(int[] a){
		int n = a.length;
		for(int i = 1; i < n; ++i){
			int instnum = a[i], j;
			for(j = i - 1; j >= 0 && a[j] > instnum; --j)
				a[j+1] = a[j];
			a[j+1] = instnum;
			printArray(a);
		}
	}
}

