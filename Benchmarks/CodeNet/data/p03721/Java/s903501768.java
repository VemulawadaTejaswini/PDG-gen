import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		int[] a = new int[100001];
		for(int i = 0; i < N; i++)
			a[sc.nextInt()] += sc.nextInt();
		long n = 0;
		for(int i = 1; i <= 100000; i++) {
			n += a[i];
			if(n >= K) {
				System.out.println(i);
				break;
			}
		}

	}

}