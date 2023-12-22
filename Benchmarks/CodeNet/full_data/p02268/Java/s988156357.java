

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = in.nextInt();
		}
		int m = in.nextInt();
		int[] b = new int[m];
		for(int i = 0; i < m; i++){
			b[i] = in.nextInt();
		}
		int count = 0;
		for(int bb : b){
			if(binarySearch(a, bb, 0, a.length) != -1)count++;
		}
		System.out.println(count);
		in.close();
	}
	static int binarySearch(int[]a,int n, int l, int r){
		while(l != r){
			int mid = (l+r)/2;
			if(a[mid] == n){
				return mid;
			}else if(a[mid] < n){
				l = mid + 1;
			}else if(a[mid] > n){
				r = mid;
			}
		}
		return -1;
	}

}