import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] a = new int[N];
		for(int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}

		int ans = 0;
		for(int i=0;i<N;i++) {

			int g;
			if(i==0) {
				g = a[1];
			}else {
				g = a[0];
			}

			for(int j=0;j<N;j++) {
				if(j == i) {
					continue;
				}else {
					g = gcd(g,a[j]);
				}
			}

			if(g > ans) {
				ans = g;
			}
		}
		System.out.println(ans);

	}

	//整数a,bの最大公約数
	public static int gcd(int a,int b) {
		if(b == 0) return a;
		else return gcd(b,a%b);
	}

}
