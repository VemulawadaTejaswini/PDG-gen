import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		long t[]=new long[n];
		long a[]=new long[n];
		for(int i=0;i<n;i++) {
			t[i]=scanner.nextInt();
			a[i]=scanner.nextInt();
		}
		for(int i=1;i<n;i++) {
			long p=calc(t[i-1],a[i-1],t,a,i);
			t[i]*=p;
			a[i]*=p;
		}
		System.out.println(t[n-1]+a[n-1]);
	}

	private static long calc(long brd_t, long brd_a, long[] t, long[] a, int i) {
		long res=Math.max(brd_t/t[i], brd_a/a[i]);
		while(t[i]*res<brd_t||a[i]*res<brd_a) {
			res++;
		}
		return res;
	}
}