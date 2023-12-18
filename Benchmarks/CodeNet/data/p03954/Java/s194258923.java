import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int L = 2*N-1;
		int[] a = new int[L];
		for(int i=0; i<L; i++)
			a[i] = sc.nextInt();
		
		int min = 1;
		int max = L;
		boolean b[] = new boolean[L];
		while(min+1 < max) {
			int mid = (min + max)/2;
			for(int i=0; i<L; i++)
				b[i] = a[i]>=mid;
			if(satisfy(b))
				min = mid;
			else
				max = mid;
		}
		System.out.println(min);
		
		sc.close();
	}
	
	static boolean satisfy(boolean[] b) {
		int L = b.length;
		int N = (L+1)/2;
		int l = N-1;
		boolean lb = false;
		for(; l>0; l--) {
			if(b[l]==b[l-1]) {
				lb = b[l];
				break;
			}
		}
		int r = N-1;
		boolean rb = false;
		for(; r<L-1; r++) {
			if(b[r]==b[r+1]) {
				rb = b[r];
				break;
			}
		}
		if(l>0) {
			if(r<L-1) {
				if(lb==rb)
					return lb;
				else
					return (l+r)/2<N ? lb : rb;
			} else {
				return lb;
			}
		} else if(r<L-1) {
			return rb;
		} else {
			return N%2==0 ^ b[N-1];
		}
	}
}
