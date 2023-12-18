import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] mens = new int[n];
		for(int i = 0; i < n; i++) {
			mens[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i = 0; i < n; i++) {
			if(k <= mens[i]) {
				ans++;
			}
		}
		System.out.println(ans);

	}

}