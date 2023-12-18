import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] x = new int[N];
		int c = 1;
		for(int i = 0; i < N; i++) {
				x[i] = sc.nextInt();
				}

		Arrays.sort(x);
		for(int i = 1; i < N; i++) {
			if(x[i] > x[i - 1])
				c++;
				}
		System.out.println(c);
		}
}

