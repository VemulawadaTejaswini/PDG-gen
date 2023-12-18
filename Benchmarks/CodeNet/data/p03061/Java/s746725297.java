import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int []l = new int [n+1];
		int []r = new int [n+1];
		l[0] = 0;
		r[n] = 0;

		for(int i = 0; i < n ; i++) {
			l[i+1] = gcd(l[i],a[i]);
		}
		for(int j = n-1; j>=0; j--) {
			r[j] = gcd(r[j+1],a[j]);
		}
		int max = 1;
		
		for(int i = 0 ; i < n ; i++) {
			int p = gcd(l[i],r[i+1]);
			if(max < p)
				max = Math.max(max, p);
        }
        System.out.println(max);
    }

    public static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

}