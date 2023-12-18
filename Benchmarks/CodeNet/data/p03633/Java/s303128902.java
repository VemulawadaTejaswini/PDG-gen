import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] t = new long[n];
		for(int i=0; i<n; i++) {
			t[i] = sc.nextLong();
		}
		sc.close();
		
		System.out.println(nlcm(t, n));
	}
	
	static long gcd(long a, long b) {
		long tmp;
		if(a<b) {
			tmp = b;
			b = a;
			a = tmp;
		}
		tmp = a%b;
		while(tmp!=0) {
			a = b;
			b = tmp;
			tmp = a%b;
		}
		return b;
	} 
	
	static long lcm(long a, long b) {
		return a/gcd(a, b)*b;
	}
	
	static long nlcm(long[] list, int n) {
		if(n==1) return list[0];
		return lcm(list[n-1], nlcm(list, n-1));
	}
}