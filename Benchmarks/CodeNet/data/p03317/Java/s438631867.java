import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();		
		int k = scan.nextInt();
		int index = 0;
		int ans = 0;

		for (int i = 0; i < n; i++) {
			if(scan.nextInt() == 1) {
				index = i + 1;
				break;
			}
		}
		ans += Math.ceil((double)(index - 1) / (k - 1));
		ans += Math.ceil((double)(n - index) / (k - 1));
		if ((double)n/k == 1) {
			System.out.println(1);
		} else {
			System.out.println(ans);
		}
	}
}