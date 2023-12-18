import java.util.Scanner;

public class Main {

	public static int[] A;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		A = new int[N];
		for(int i = 0; i < N ; i++) {
			A[i] = sc.nextInt();
		}

		sc.close();

		int answer = 0;
		int[] M = new int[N];
		for(int i = 0 ; i < N ; i++) {
			M[i] = gcd(L(i,A),R(i+1,A));
			//System.out.println("M[" + i +"]:" + M[i]);
			if(M[i] > answer) {
				answer = M[i];
			}
		}

		System.out.println(answer);
	}

	private static int R(int i,int[] A) {
		if(i == 0) {
			return 0;
		} else if(i >= A.length) {
			return 0;
		} else {
			return gcd(R(i+1,A), A[i]);
		}
	}

	private static int L(int i,int[] A) {
		if(i == 0) {
			return 0;
		} else if(i >= A.length) {
			return 0;
		} else {
			return gcd(L(i-1,A), A[i-1]);
		}
	}

	public static int gcd(int a, int b) {
		int tmp;
		if(b > a) {
			tmp = a;
			a = b;
			b = tmp;
		}

		if(b == 0) {
			return a;
		}

	    int r = -1;
	    do{
	        r = a % b;
	        a = b;
	        b = r;
	    }while (r != 0);

	    return a;
	}

}