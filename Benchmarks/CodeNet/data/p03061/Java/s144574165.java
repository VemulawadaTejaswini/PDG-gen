import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());

		long[] A = new long[N];
		long[] L = new long[N];
		long[] R = new long[N];

		for(int i = 0;i<N;i++) {
			A[i]=Long.parseLong(sc.next());
		}

		long w = A[0];
		for(int i=0;i<N-1;i++){
			w = GCD(w,A[i]);
			L[i] = w;
			if(w==1) break;
		}
		w = A[N-1];
		for(int i=N-1;i>=0;i--){
			w = GCD(w,A[i]);
			R[i] = w;
			if(w==1) break;
		}
		long max = 0;
		long tmp = 0;

		for(int i=0;i<N;i++) {
			if(i==0) {
				tmp = R[i+1];
			}else if(i==N-1) {
				tmp = L[i-1];
			}else {
				tmp = GCD(L[i-1],R[i+1]);
			}

			if(max<tmp) {
				max=tmp;
			}
		}

		System.out.println(max);
		sc.close();
	}
	static long GCD(long a,long b) {
		if(a>b) {
			long tmp;
	        while ((tmp = a % b) != 0) {
	            a = b;
	            b = tmp;
	        }
	        return b;
		}else {
			long tmp;
	        while ((tmp = b % a) != 0) {
	            b = a;
	            a = tmp;
	        }
	        return a;
		}
	}
}