import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] A = new int[N];
		for(int i = 0; i < N ; i++) {
			A[i] = sc.nextInt();
		}

		int j = 0;
		int max = 0;
		for(int i = 0 ; i < N - 1 ;i ++) {
			j = gcd(A[i], A[i+1]);
			if(j > max) {
				max = j;
			}
		}

		for(int i = 0 ; i < N ;i ++) {
			if(A[i]%max !=0) {
				A[i] = max;
				break;
			}
		}

		sc.close();

		int answer = gcd(A[0],A[1]);

		for(int i = 1 ; i < N - 1 ;i ++) {
			answer = gcd(answer, A[i+1]);
		}

		System.out.println(answer);
	}

	public static int gcd(int a, int b) {
		int tmp;
		if(b > a) {
			tmp = a;
			a = b;
			b = tmp;
		}

	    int r = -1;
	    while (r != 0) {
	        r = a % b;
	        a = b;
	        b = r;
	    }

	    return a;
	}

}
