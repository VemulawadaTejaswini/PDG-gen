import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[scanner.nextInt()];
		for(int i = 0; i < a.length ; i++) {
			a[i] = scanner.nextInt();
		}
		for(int k = 0; k < a.length - 1; k++) {
			System.out.print(a[k] + " ");
		}
		System.out.print(a[a.length - 1]);
		System.out.println();
		insertionSort(a);	
	}
		
	public static void insertionSort(int[] a) {
		for(int i = 1; i < a.length ; i++) {
			int key = a[i];
			int j = i;
			while(j > 0 && key < a[j - 1]) {
				j--;
				a[j+1] = a[j];
			}
			a[j] = key;
			for(int k = 0; k < a.length - 1; k++) {
				System.out.print(a[k] + " ");
			}
			System.out.print(a[a.length - 1]);
			System.out.println();
		}
	}
}

