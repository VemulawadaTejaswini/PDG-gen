import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scan.nextInt();
		int k = scan.nextInt() - 1;

		int ans = 0;

		int oneIndex = 0;

		for(int i = 0; i < n; i++) {
			if(scan.nextInt() == 1) oneIndex = i;
		}
		
		ans += oneIndex / k;
		if(oneIndex % k != 0) ans++;
		ans += (n - 1 - oneIndex) / k;
		if((n - 1 - oneIndex) % k != 0) ans++;

		System.out.println(ans);
	}

}
