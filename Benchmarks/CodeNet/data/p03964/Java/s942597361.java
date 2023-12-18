import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int t[]=new int[n];
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			t[i]=scanner.nextInt();
			a[i]=scanner.nextInt();
		}
		for(int i=1;i<n;i++) {
			int p=calc(t[i-1],a[i-1],t,a,i);
			t[i]*=p;
			a[i]*=p;
		}
		System.out.println(t[n-1]+a[n-1]);
	}

	private static int calc(int brd_t, int brd_a, int[] t, int[] a, int i) {
		int res=1;
		while(t[i]*res<brd_t||a[i]*res<brd_a) {
			res++;
		}
		return res;
	}
}