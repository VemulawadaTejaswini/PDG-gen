import java.util.Scanner;

public class Main {

	static int n, a, b, h[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		h = new int[n];
		for(int i=0;i<n;i++)h[i] = sc.nextInt();
		sc.close();
		
		int l = 0;
		int r = (int)1e9+100;
		while(l+1<r) {
			int c = (l+r)/2;
			if(check(c))r = c;
			else l = c;
		}
		
		System.out.println(r);
		
	}
	
	static boolean check(int x) {
		long num = 0;
		for(int i=0;i<n;i++) {
			int t = h[i];
			t -= b*x;
			if(t > 0) {
				num += ((long)t +(a-b-1) )/(a-b);
			}
			if(num>x) {
				return false;
			}
		}
		return true;
	}
}

