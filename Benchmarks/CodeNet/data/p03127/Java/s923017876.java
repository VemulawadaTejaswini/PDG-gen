import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}
	
	public void solve(Scanner sc) {
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			int ai = Integer.parseInt(sc.next());
			a[i] = ai;
		}
		quickSortAsc(a, 0, a.length-1);
		
		int min = a[0];
		int minMod = min;
		while(true) {
			for(int i=0; i<n; i++) {
				int mod = a[i] % min;
				
				if( mod == 1 ) {
					System.out.println(1);
					return;
				}
				
				if(mod != 0 && mod < minMod) {
					minMod = mod;
				}
			}
			
			if(minMod == min) {
				System.out.println(min);
				return;
			}
			min = minMod;
		}
	}
	
	private void quickSortAsc(int[] target, int left, int right) {
		if(left >= right) return;
		
		int pivot = target[(left+right)/2];
		
		int l = left;
		int r = right;
		while(l <= r) {
			while(target[l] < pivot) {l++;}
			while(target[r] > pivot) {r--;}
			if(l<=r) {
				int tmp = target[l];
				target[l] = target[r];
				target[r] = tmp;
				l++;
				r--;
			}
		}
		quickSortAsc(target, left, r);
		quickSortAsc(target, l, right);
	}
}
