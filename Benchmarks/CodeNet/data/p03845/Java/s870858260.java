import java.util.*;
// warm-up
public class Main {

	static int[] a = null;

	static int sum () {
		int s = 0;
		for (int b : a) s+=b;
		return s;
	}

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), i=1, j=1;
		a = new int[n+1];
		while (n-->0) a[i++] = sc.nextInt();
		int m = sc.nextInt(), s = sum();
		while (m-->0) {
			int k = sc.nextInt(), t = sc.nextInt();
			s-=a[k];
			System.out.println(s+t); 
			s+=a[k];
			j++;
		}
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}