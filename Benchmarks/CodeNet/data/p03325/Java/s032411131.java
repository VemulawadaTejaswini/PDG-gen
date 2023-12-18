import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i = 0; i < n; i++) {
			if(array[i] % 2 == 0) ans += 2;
			else ans++;
		}
		if(ans == n) ans = 0;
		System.out.println(ans);
	}
}
