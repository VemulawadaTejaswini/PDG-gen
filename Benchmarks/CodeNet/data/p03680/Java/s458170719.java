import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0 ; i < N ; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < N ; i++) {
			a[i]--;
		}
		int x = 0;
		for(int i = 0 ; i < N ; i++) {
			if(x == 1) {
				System.out.println(i);
				return;
			}
			x = a[i];
		}
		System.out.println(-1);
	}
}
