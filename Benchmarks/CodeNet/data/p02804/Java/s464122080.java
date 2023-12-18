import java.util.*;

public class Main {
	static int M = (int)1e9 + 7;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		long[] mm = new long[100005];
		mm[0] = 1;
		long[] nn = new long[100005];
		nn[0] = 1;
		for(int i=1;i<mm.length;i++) {
			mm[i] = mm[i-1] * i % M;
			nn[i] = nn[i-1] * fp(i, M-2) % M;
		}
		
		long sum = 0;
		for(int i=n-1;i>=k-1;i--) {
			long num = (a[i]-a[n-1-i]) * mm[i] % M * nn[i-k+1] % M * nn[k-1] % M;
			sum = (sum + num) % M;
		}
		
		System.out.println(sum);
		
	}
	static long fp(int a, int p) {
		if(p == 0)
			return 1;
		
		long num = fp(a, p/2);
		if(p % 2 == 0)
			return num * num % M;
		else
			return num * num % M * a % M;
	}
}