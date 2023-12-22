

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		new Main().start();
	}
	void start(){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = in.nextInt();
		}
//		a = insertionSort(a,n);
		a = selectionSort(a,n);
		
		in.close();

	}

	int[] insertionSort(int[]a, int n){
		for(int i = 1; i < n; i++){
			printArray(a);
			int v = a[i];
			int j = i - 1;
			while(j >= 0 && a[j] > v){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = v;
		}
		return a;
	}
	int[] selectionSort(int[] a, int n){
		int count = 0;
		for(int i = 0; i < n; i++){
//			printArray(a);
			int minj = i;
			for(int j = i; j < n;j++){
				if(a[j] < a[minj]) minj = j;
			}
			if(minj != i){
				int tmp = a[i];
				a[i] = a[minj];
				a[minj] = tmp;
				count++;
			}
		}
		printArray(a);
		System.out.println(count);
		return a;
	}
	void printArray(int[] a){
		System.out.print(a[0]);
		for(int i= 1; i < a.length; i++){
			System.out.print(" " + a[i]);
		}
		System.out.println();
	}

}