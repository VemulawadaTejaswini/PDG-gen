import java.util.Scanner;
public class Main {
	
	private static int gcd(int a, int  b) {
		int  temp = 0;

		if(a == 0) {
			return b;
		}
		if(b == 0) {
			return a;
		}
		if(a != 0 && b != 0) {
		while (a % b != 0){
			temp = a;
			a = b;
			b = temp % b;
		}
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []a = new int [n];
		
		for(int i = 0; i < n ; i++) {
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
	}

