

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		for (int i = 0 ;i < n;i++) {
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] b = new int[m];
		for(int j = 0 ;j < m;j++) {
			b[j] = sc.nextInt();
		}
		sc.close();
		for(int j = 0 ;j < m;j++) {
			if(LineSearch1(a,b[j])) {
				count++;
			}
		}
		System.out.println(count);
		
	}
	public static boolean LineSearch1(int[] arr,int key) {
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] == key) {
				return true;
			}
		}
		return false;
		
	}
	public static boolean LineSearch(int[] arr,int key) {
		int i = 0;
		int n = arr.length-1;
		//最后一个设置为Key
		arr[n] = key;
		while(arr[i] != key) {
			i++;
			if(i == n) {
				return false;
			}
		}
		return true;
		
	}
}

