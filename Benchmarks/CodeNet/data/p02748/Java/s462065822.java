import java.util.*;

public class Main {
		public static void main(String[] args) {
		
	   Scanner sc = new Scanner(System.in);
	   
	   int A = sc.nextInt();
	   int B = sc.nextInt();
	   int M = sc.nextInt();
	   
		Integer a[] = new Integer[A];
		Integer b[] = new Integer[B];
		Integer x[] = new Integer[M];
		Integer y[] = new Integer[M];
		Integer c[] = new Integer[M];
		for(int i=0; i<A; i++) {
		a[i] = sc.nextInt();
		}
		for(int i=0; i<A; i++) {
		b[i] = sc.nextInt();
		}
		int sum = 100;
		for(int i=0; i<A; i++) {
			for(int j=0; j<B; j++) {
				int e = a[i] + b[j];
				if(sum > e) {
					sum = sum - sum + e;
				}
			}
		}
		for(int k=0; k < M; k++) {
			x[k] = sc.nextInt();
			y[k] = sc.nextInt();
			c[k] = sc.nextInt();
			int e = a[x[k]-1] + b[y[k]-1] - c[k];
			if(sum > e) {
				sum = sum -sum + e;
			}
		}
	   System.out.println(sum);
	   
	   }
}


