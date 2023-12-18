import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] a = new int[n];
	for(int i = 0; i < n; i++) {
		a[i] = sc.nextInt();
	}
	int p = 0;
	int[] b = new int[n];
	for(int i = 0; i < n; i++) {
		if(i == 0) {
			p += a[0];
		} else if(i == n - 1) {
			p += a[n-1];
		} else {
			p += Math.abs(a[i+1] - a[i]);
		}
		b[i] = p;
	}
	int s = 0;
	for(int i = 0; i < n; i++) {
		s += b[i];
	}
	for(int i = 0; i < n; i++) {
		if(i == 0) {
			System.out.println(p - Math.abs(a[i]));
		} else if(i == n - 1) {
			System.out.println(p - Math.abs(a[n-1]));
		} else {
			if(a[i-1] <= a[i] && a[i] <= a[i+1]) {
				System.out.println(s);
			} else if(a[i-1] >= a[i] && a[i] >= a[i+1]) {
				System.out.println(s);
			} else if(a[i-1] <= a[i+1] && a[i+1] <= a[i]) {
				System.out.println(s - (2 * Math.abs(a[i+1] - a[i])));
			} else if(a[i] <= a[i-1] && a[i-1] <= a[i+1]) {
				System.out.println(s - (2 * Math.abs(a[i-1] - a[i])));
			} else if(a[i+1] <= a[i-1] && a[i-1] <= a[i]) {
				System.out.println(s - (2 * Math.abs(a[i-1] - a[i])));
			} else if(a[i-1] <= a[i+1] && a[i+1] <= a[i]) {
				System.out.println(s - (2 * Math.abs(a[i+1] - a[i])));
			}
		}
	}
}
}
