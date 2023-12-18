import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] array = new long[N];
		long[] sort_array = new long[N];
		long cnt = 0;
		for (int i=0; i<N; i++) {
			long A = sc.nextLong();
			array[i] = A;
			sort_array[i] = A;
		}
		Arrays.sort(sort_array);
		for (int i=0; i<N; i++) {
			int j = indexOf(sort_array, array[i], 0, N);
			if ((i+j)%2==1) cnt++;
		}
		System.out.println((long)((cnt+1)/2));
		sc.close();
	}
	
	private static int indexOf(long[] array, long v, int h, int t) {
		long l = array[(h+t)/2];
		if (v==l) return (h+t)/2;
		else if (v<l) return indexOf(array, v, h, (h+t)/2);
		else return indexOf(array, v, (h+t)/2, t);
	}

}
