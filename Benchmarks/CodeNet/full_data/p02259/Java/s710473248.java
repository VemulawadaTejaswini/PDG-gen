import java.util.*;

public class Main {
	public static void main(String[] args) {
		//ALDS1_1_A(); 
		ALDS1_2_A();
	}
	public static void ALDS1_1_A() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for(int i = 1; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j == n - 1) {
					System.out.print(a[j]);
				}else {
					System.out.print(a[j] + " ");
				}
			}
			System.out.println();
			int temp = a[i];
			int j = i - 1;
			while(j >= 0 && temp < a[j]) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = temp;
		}

		for(int j = 0; j < n; j++) {
			if(j == n - 1) {
				System.out.print(a[j]);
			}else {
				System.out.print(a[j] + " ");
			}
		}
		System.out.println();
	}

	public static void ALDS1_2_A() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int countAns = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			int j;
			for(j = n - 2; j >= i; j--) {
				if(a[j + 1] < a[j]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
					countAns++;
				}
			}
			/*
			for(int ans: a) {
				System.out.print(ans + " ");
			}
			System.out.println();
			while(j >= 0 && a[j + 1] < a[j]) {
				int temp = a[j + 1];
				a[j + 1] = a[j];
				a[j] = temp;
				countAns++;
				j--;
			}
			*/
		}

		for(int i = 0; i < n; i++) {
			System.out.print(a[i]);
			if(i != n - 1)
				System.out.print(" ");
		}
		System.out.println();
		System.out.println(countAns);
	}
}

