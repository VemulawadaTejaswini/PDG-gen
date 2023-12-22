import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] array = new int[n + 1];
		int[] arrayL = new int[n / 2 + 2];
		int[] arrayR = new int[n / 2 + 2];
		
		for (int i = 0; i < n; i++){
			array[i] = scanner.nextInt();
		}
		array[n] = 1 << 28;
		
		mergeSort(array, arrayL, arrayR, 0, n);
		
		int res = 0;
		int q = scanner.nextInt();
		for (int i = 0; i < q; i++){
			int key = scanner.nextInt();
			res += binarySearch(array, n, key + 1) - binarySearch(array, n, key);
		}
		
		System.out.println(res);
	}
	
	public static void mergeSort(int[] array, int[] arrayL, int[] arrayR, int left, int right){
		if (right - left <= 1) return;
		
		int mid = (left + right) / 2;
		
		mergeSort(array, arrayL, arrayR, left, mid);
		mergeSort(array, arrayL, arrayR, mid, right);
		
		int n1 = mid - left;
		int n2 = right - mid;
		
		for (int i = 0; i < n1; i++) arrayL[i] = array[left + i];
		for (int i = 0; i < n2; i++) arrayR[i] = array[mid + i];
		arrayL[n1] = arrayR[n2] = 1 << 28;
		
		int l = 0, r = 0;
		for (int k = left; k < right; k++){
			if (arrayL[l] <= arrayR[r]) array[k] = arrayL[l++];
			else array[k] = arrayR[r++];
		}
	}
	
	public static int binarySearch(int[] array, int n, int key){
		int l = 0, r = n;
		while (l < r){
			int m = (l + r) / 2;
			if (array[m] < key) l = m + 1;
			else r = m - 1;
		}
		//System.out.println(array[l]);
		return l;
	}
}