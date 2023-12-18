import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		
		for(int i=0; i<n; i++){
			a[i] = sc.nextLong();
		}
		for(int i=0; i<n; i++){
			ans += a[i];
			if(a[i] == 1){
				ans = 1;
				break;
			}
		}
		
		if(ans % 2 == 1){
			System.out.println("first");
		}else{
			System.out.println("second");
		}
	}
	
	static void quick_sort(long[] d, int left, int right) {
		if(left>=right){
				return;
		}
		long p = d[(left+right)/2];
		int l = left, r = right;
		long tmp;
		while(l<=r){
			while(d[l] > p){ l++; }
			while(d[r] < p){ r--; }
			if (l<=r) {
				tmp = d[l]; d[l] = d[r]; d[r] = tmp;
				l++;
				r--;
			}
		}
		quick_sort(d, left, r);
		quick_sort(d, l, right);
	}
}