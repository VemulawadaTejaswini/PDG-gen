import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] A = new int[N];

		int min = 0;

		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
			min = i==0 || min > A[i] ? A[i] : min;
		}

		int count = 0;
		for(int i=0; i<Math.log(min)/Math.log(2); i++) {
			boolean flag = false;
			for(int j=0; j<N; j++) {
				if(A[j]%2 != 0) flag = true;
				A[j] = A[j]/2;
			}
			if(flag) {
				break;
			}else {
				count++;
			}
		}

		System.out.println(count);
	}

	public static void print(Object o) {
		System.out.print(o);
	}

	public static void println(Object o) {
		System.out.println(o);
	}
}