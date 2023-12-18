import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int X = in.nextInt();
		int[] x = new int[n];
		for(int i=0;i<n;i++) {
			x[i] = abs(X-in.nextInt());
		}
		if(n==1) System.out.println(x[0]);
		else {
			int ans = gcd(x[0],x[1]);
			for(int i=2;i<n;i++) {
				ans = gcd(ans,x[i]);
			}
			System.out.println(ans);
		}
		
		

	}
	
	public static int abs(int a) {
		if(a>0) return a;
		else return -a;
	}
	
	public static int gcd(int a,int b) {
		if(a%b==0) return b;
		else return gcd(b,a%b);
	}

}
