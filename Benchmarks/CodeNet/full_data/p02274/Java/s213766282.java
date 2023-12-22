
import java.util.Scanner;

public class Main {
	//implement the inversion pair with a modified version of merge algorithm
	
	public static long inter_count(int[] arr, int lo, int mid, int hi) {
		int n_l = mid - lo +1;
		int n_r = hi - mid;
		int [] L = new int[n_l+1];
		int [] R = new int[n_r+1];
		
		for(int i = 0; i< n_l; i++) {
			L[i] = arr[lo+i];
		}
		
		for(int j = 0; j < n_r; j++) {
			R[j] = arr[mid + j +1];
		}
		
		L[n_l] = Integer.MAX_VALUE;
		R[n_r] = Integer.MAX_VALUE;
		
		int l_i = 0;
		int r_i = 0;
		long c = 0;
		
		int i = lo;
		while(i <= hi) {
			if(L[l_i] > R[r_i]) {
				arr[i] = R[r_i];
				c += n_l - l_i;
				r_i++;
			}else {
				arr[i] = L[l_i];
				l_i++;
			}
			i++;
		}
		
		
		
		return c;
	}
	
	public static long count_inv(int [] arr, int lo, int hi) {
		if(lo == hi) return 0;
		
		int mid = (lo + hi) >> 1;
		long ans = 0;
		
		ans += count_inv(arr, lo, mid);
		ans += count_inv(arr, mid+1, hi);
		
		
		return ans + inter_count(arr, lo, mid, hi);
	}
	
	public static void main(String [] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = cin.nextInt();
		}
		
		System.out.println(count_inv(arr, 0, arr.length-1));
		
		cin.close();
	
	}
}