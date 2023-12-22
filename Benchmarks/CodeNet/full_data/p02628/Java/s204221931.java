import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] p = new int[N];
		int a = 0;
		for(int i=0; i<N; i++) {
			p[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(p);
		for(int i=0; i<K; i++) {
			a += p[i];
		}
		System.out.println(a);
	}

}