import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] d = new int[N];
		for(int i = 0; i < N; i++) {
			d[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		Arrays.sort(d);
		int count = 1;
		int bottom = d[N - 1];
		for(int i = N - 2; i >= 0; i--) {
			if(d[i] < bottom) {
				bottom = d[i];
				count++;
			}
		}
		System.out.println(count);
	}
}