import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		long A[] = new long[N];
		long ans = 1;
		long n = (1000000000*1000000000)+1;
		
		for(int i=0;i<N;i++) {
			A[i] = scan.nextLong();
			ans = ans * A[i];
		}
		if(ans>1000000000000000000L) {
			ans = -1;
		}
		System.out.println(n);
		System.out.println(ans);
	}
}
