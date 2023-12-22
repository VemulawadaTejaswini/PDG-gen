import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long x[] = new long[N];
		long y[] = new long[N];
		long temp[] = new long[N];
		for(int i=0;i<N;i++) {
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
			temp[i] = x[i]+y[i];
		}
		Arrays.sort(temp);
		long max =temp[N-1]-temp[0];
		for(int i=0;i<N;i++) {
			temp[i] = x[i]-y[i];
		}
		Arrays.sort(temp);
		if (max<temp[N-1]-temp[0]) {
			max = temp[N-1]-temp[0];
		}
		System.out.println(max);
	}
}
