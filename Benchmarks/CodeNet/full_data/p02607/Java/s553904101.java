import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] a = new int[N];

		int ans = 0;
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
			if(i % 2 == 0 && a[i] % 2 != 0) {
				ans++;
			}
		}

		System.out.println(ans);
	}

}
