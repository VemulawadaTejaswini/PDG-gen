import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] l = new int[N];

		for(int i=0; i<N; i++) {
			l[i] = sc.nextInt();
		}Arrays.sort(l);

		int length = 0;

		for(int j=0; j<K; j++) {
			length += l[N-1-j];
		}

		System.out.println(length);

	}

}
