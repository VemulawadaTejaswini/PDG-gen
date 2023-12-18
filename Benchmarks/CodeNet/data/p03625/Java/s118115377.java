import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long[] A = new long[N];
		for(int i = 0;i < N;i++) {
			A[i] = scn.nextLong();
		}
		Arrays.sort(A);
		int count = 0;
		long buf = 0;
		long a = 0,b = 0;
		for(int i = N-1;i > -1;i--) {
			if(buf == A[i]) {
				count ++;
			}else {
				buf = A[i];
				count = 1;
			}

			if(count == 2) {
				if(a!=0) {
					b = buf;
					break;
				}else {
					a = buf;
					count = 0;
				}
			}
		}
		System.out.println(a*b);
	}

}
