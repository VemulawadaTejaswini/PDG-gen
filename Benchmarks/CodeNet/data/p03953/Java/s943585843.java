import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i;
		long x[] = new long[N];
		for(i=0;i<N;i++){
			x[i] = sc.nextLong();
		}
		
		int M = sc.nextInt();
		long K = sc.nextLong();
		int a[] = new int[M];
		
		for(i=0;i<M;i++){
			a[i] = sc.nextInt();
		}
		
		long k;
		
		for(k=0;k<K;k++){
		
		//一回の体操
		for(i=0;i<M;i++){
			x[a[i]] = x[a[i]-1]+x[a[i]+1]-x[a[i]];
		}
		
		}

		for(i=0;i<N-1;i++){
			System.out.println(x[i]);
		}
	}

}