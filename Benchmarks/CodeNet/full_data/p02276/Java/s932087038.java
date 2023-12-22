

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i < n;i++ ) {
			a[i] = sc.nextInt();
		}
		sc.close();
		int q =partition1(a, 0, n-1);
		for(int i = 0 ;i < a.length ; i++) {
			if(i>0) System.out.print(" ");
			if(i==q) {
				System.out.print("[");
			}
			System.out.print(a[i]);
			if(i==q) {
				System.out.print("]");
			}
		}
		System.out.println();
	}
	public static int partition(int[] arr,int p,int r ) {
		int x = arr[r];
		int i = p-1;
		for(int j = p;j < r;j++) {
			if(arr[j] <= x) {
				i++;
				arr[i] = arr[i] ^ arr[j];
				arr[j] = arr[i] ^ arr[j];
				arr[i] = arr[i] ^ arr[j];
			}	
		}
		arr[i+1] = arr[i+1] ^ arr[r];
		arr[r] = arr[i+1] ^ arr[r];
		arr[i+1] = arr[i+1] ^ arr[r];
		return i+1;
	}
	public static int partition1(int[] arr,int p,int r ) {
		int x = arr[r];
		int i = p-1;
		int t;
		for(int j = p;j < r;j++) {
			if(arr[j] <= x) {
				i++;
				t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}	
		}
		t = arr[i+1];
		arr[i+1] = arr[r];
		arr[r] = t;
		return i+1;
	}
	
}

