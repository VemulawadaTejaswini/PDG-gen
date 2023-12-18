import java.util.*;

class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		int[] h = new int[n];
		for(int i=0;i<n;i++) {
			h[i] = in.nextInt();
		}
		for(int i=0;i<n;i++) {
			a[i] = Integer.MAX_VALUE;
		}
		a[0] = 0;
		for(int i=0;i<n;i++) {
			if(i<n-1)a[i+1] = Math.min(a[i+1], a[i]+Math.abs(h[i]-h[i+1]));
			if(i<n-2)a[i+2] = Math.min(a[i+2], a[i]+Math.abs(h[i]-h[i+2]));
		}
		System.out.println(a[n-1]);
	}
}