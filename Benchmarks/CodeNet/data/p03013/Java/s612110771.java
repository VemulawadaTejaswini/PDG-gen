import java.util.Scanner;

// Typical Stairs_129_C

public class Main {

	public static long ans(long n) {
		if(n>=3L) {
			return ans(n-1)+ans(n-2);
		}else if(n==2L) {
			return 2L;
		}else{
			return 1L;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] a = new int[M];
		long[] div = new long[M+1];
		long answer = 1L;

		for(int i=0;i<M;i++) {
			a[i] = scan.nextInt();
			}

		for(int i=0;i<M-1;i++) {
			int sub = a[i+1] - a[i];
			if(sub==1) {
				sub = 0;
				System.out.println(sub);
				System.exit(0);
			}
		}

		for(int i=0;i<M;i++) {
			if(i==0) {
				div[i] = ans((long)a[i]-1L);
			}else if(i!=0 && i < M-2){
				div[i] = ans((long)a[i]-(long)a[i-1]-2L);
			}else {
				div[i] = ans((long)N - (long)a[i]-1L);
			}
			div[i+1] = ans((long)N - (long)a[i]-1L);
		}

		for(long d:div) {
			answer *= d;
		}
		answer = answer % 1000000007;

		System.out.println(answer);

		scan.close();
	}

}
