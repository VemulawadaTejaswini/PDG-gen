import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N-1; i++) {
			a[sc.nextInt()]++;
		}		
		for (int i = 1; i < N; i++) {
			System.out.println(a[i]);
		}
		System.out.println(0);
	}
}