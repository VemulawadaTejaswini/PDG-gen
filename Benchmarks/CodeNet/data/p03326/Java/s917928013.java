import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static int []S = new int[3];
	static int [][]bit = new int[8][3];
	public static int n = 3;
	public static int cnt = 0;;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		long []x = new long[N];
		long []y = new long[N];
		long []z = new long[N];

		for(int i = 0; i < N; i++) {
			x[i] = scan.nextLong();
			y[i] = scan.nextLong();
			z[i] = scan.nextLong();
		}
		scan.close();
		long []p = new long[N];
		rec(0);

		long max = 0;
		for(int i = 0; i < 8; i++) {
			int sign1, sign2, sign3;
			sign1 = 1;
			sign2 = 1;
			sign3 = 1;
			if(bit[i][0] == 0) {
				sign1 = -1;
			}
			if(bit[i][1] == 0) {
				sign2 = -1;
			}
			if(bit[i][2] == 0) {
				sign3 = -1;
			}
			for(int j = 0; j < N; j++) {
				p[j] = sign1 * x[j] + sign2 * y[j]
						+ sign3 * z[j];
			}
			Arrays.sort(p);
			long temp = 0;
			for(int j = N - 1; j >= N - M; j--) {
				temp += p[j];
			}
			if(max < temp) {
				max = temp;
			}

		}
		System.out.println(max);

	}
	public static void rec(int k) {
        if(k == n) {
        	for(int i = 0; i < n; i++) {
        		bit[cnt][i] = S[i];
        	}
        	cnt ++;
        	//disp(S);
            return;
        }
        rec(k + 1);
        S[k] = 1;
        rec(k + 1);
        S[k] = 0;
    }
	public static void disp(int []A) {
		for(int i = 0; i < A.length - 1; i++) {
			System.out.print(A[i] + ", ");
		}
		System.out.println(A[A.length -1]);
	}
}