import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		long ans=a[0];
		for(int i=1;i<N;i++) {
			ans = lcm(ans,a[i]);
		}
		ans--;
		long ans2 = 0;
		for(int i=0;i<N;i++) {
			ans2 += ans % a[i];
		}
		System.out.println(ans2);
	}
	static long lcm(long a,long b) {
		long tempA = a;
		long tempB = b;
		if(a < b) {
			long tmp = a;
			a = b;
			b = tmp;
		}
		while(a % b != 0) {
			long temp = b;
			b = a % b;
			a = temp;
		}
		return tempA * tempB / b;
	}
}
