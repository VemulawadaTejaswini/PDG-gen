import java.util.Scanner;

public class Main {

	static int[] A;
	static int[] B;
	static boolean flg=false;
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N=Integer.parseInt(scanner.next());
	    int M=Integer.parseInt(scanner.next());
	    long K=Long.parseLong(scanner.next());
	    A=new int[N];
	    B=new int[M];
	    long cm=0;
	    long tmp=0;
	    for (int i = 0; i<N; i++) {
	        A[i] =Integer.parseInt(scanner.next());
	    }
	    for (int i = 0; i<M; i++) {
	        B[i] =Integer.parseInt(scanner.next());
	    }


	    for (int i = 0; i<=N; i++) {
	        tmp=f(N-i, K);
	        if (tmp > cm) {
	        	cm=tmp;
	        }
	        if (flg) {
	        	break;
	        }
	    }

	    System.out.println(cm);
	}

	public static int f(int n, long k) {
		long t=0;
		int c=0;
		for (int i=0; i<n; i++) {
			if (t + A[i]<=k) {
				t+=A[i];
				c++;
			} else {
				return c;
			}
		}

		for (int i=0; i<B.length; i++) {
			if (t + B[i]<=k) {
				t+=B[i];
				c++;
			} else {
				return c;
			}
		}
		flg=true;

		return c;
	}

}