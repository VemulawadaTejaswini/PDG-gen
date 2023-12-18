import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0 ; i < n ; i++) {
			h[i] = sc.nextInt();
		}

		// 最大の高さを覚えておく
		int maxH = h[0];
		int ans = 1;
		for(int i = 1 ; i < n ; i++) {
			int current = h[i];
			if(current >= maxH) {
				ans++;
				maxH = current;
			}
		}
		System.out.println(ans);
		sc.close();

	}

}
