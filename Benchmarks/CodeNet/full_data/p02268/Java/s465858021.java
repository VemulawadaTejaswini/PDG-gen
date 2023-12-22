import java.util.*;

public class Main{

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
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
			if(binarySearch(a,b[j]) == 1) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static int binarySearch(int[] arr, int x) {
		int left = 0;
		int right = arr.length-1;
		int mid ;
		while(left <= right) {
			mid = (left+right)/2;
			if(arr[mid] == x) {
				return 1;
			}else if(arr[mid] > x) {
				right = mid-1;
			}else {
				left = mid+1;
			}
		}
		return 0;
	}

}
