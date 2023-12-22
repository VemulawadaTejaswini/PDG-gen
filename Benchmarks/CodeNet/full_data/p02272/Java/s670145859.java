
import java.util.Scanner;

// this file implements the merge sort
public class Main {
	
	public static int compare_count = 0;
	public static void merge(int [] arr, int lo, int mid, int hi) {
		// now the arr[lo ... mid] arr[mid+1 ... hi] are ordered;
		int n_l = mid - lo + 1;
		int n_r = hi - mid;
		int[] L = new int[n_l+1];
		int[] R = new int[n_r+1];
			
		for(int i = 0; i < n_l; i++) {
			L[i] = arr[lo+i];
		}
		
		for(int j = 0; j < n_r; j++) {
			R[j] = arr[mid + j + 1]; 
		}
		
		
		//this is a tricky point!! 
		L[n_l] = Integer.MAX_VALUE;
		R[n_r] = Integer.MAX_VALUE;
		
		//now do the merge
		int i = lo;
		int l_i = 0, r_i = 0;
		while(i <= hi) {
			compare_count++;
			if(L[l_i] < R[r_i]) {
				arr[i] = L[l_i];
				l_i ++;
			}else {
				arr[i] = R[r_i];
				r_i++;
			}
			
			i++;
		}
		
		return;
	}
	
	
	public static void merge_sort(int [] arr, int lo, int hi) {
		if(lo == hi) {
			return ;
		} // which means eveything is ordered
		
		int mid = (lo + hi) >> 1;
		
		merge_sort(arr, lo, mid);
		merge_sort(arr, mid+1, hi);
		merge(arr, lo, mid, hi);
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0 ; i < n; i++) {
			arr[i] = cin.nextInt();
		}
		
		merge_sort(arr, 0, arr.length-1);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i < arr.length-1) {
				System.out.print(" ");
			}else {
				System.out.println();
			}
		}
		
		
		System.out.println(compare_count);
	}
}