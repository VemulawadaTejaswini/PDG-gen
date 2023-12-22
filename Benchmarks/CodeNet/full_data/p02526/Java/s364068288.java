import java.util.*;

/* No.10031 */
public class Main {
	static void QuickSort(int[] arr,int left, int right) {
		if ( left <= right ) {
			int pivot = arr[(left+right)/2],
			l = left , r = right;			
			while( l <= r ) {
				while ( arr[l] < pivot ) l++;
				while ( arr[r] > pivot ) r--;
				if ( l <= r ) {
					int tmp = arr[l];
					arr[l] = arr[r];
					arr[r] = tmp;
					l++; r--;
				}
			}
			QuickSort(arr,left,r);
			QuickSort(arr,l,right);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] s = new int[1000000] , t = new int[500000];
		int n = sc.nextInt();
		for ( int i = 0; i < n; i++ )
			s[i] = sc.nextInt();
		int m = sc.nextInt();
		for ( int i = 0; i < m; i++ )
			t[i] = sc.nextInt();
		QuickSort(s,0,n-1);
		QuickSort(t,0,m-1);
		int count = 0 , S = 0 , T = 0;
		while ( T < m && S < n) {
			if ( s[S] > t[T] )
				T++;
			else if ( s[S] < t[T] )
				S++;
			else {
				count++; T++;
			}
		}
		System.out.println(count);
	}
}