import java.util.*;
public class Main{
	public static void main(String[] args){
		long ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		long[] a = new long[m];
		for(int i=0; i<m; i++){
			a[i] = sc.nextLong();
		}
		
		quick_sort(a, 0, m-1);
		
		long[] difs = new long[m-1];
		for(int i=1; i<m; i++){
			difs[i-1] = a[i] - a[i-1];
		}
		
		quick_sort(difs, 0, m-2);
		for(int i=0; i<m-n; i++){
			ans += difs[i];
		}
		
		System.out.println(ans);
	}
	
	static void quick_sort(long[] d, int left, int right) {
		if(left>=right){
				return;
		}
		long p = d[(left+right)/2];
		int l = left, r = right;
		long tmp;
		while(l<=r){
			while(d[l] < p){ l++; }
			while(d[r] > p){ r--; }
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