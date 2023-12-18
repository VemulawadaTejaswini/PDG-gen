import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] num = new int[n + 1];
		Arrays.setAll(num, i -> -1);
		
		for (int i = 0; i < m; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();
			if (num[s] != -1 && num[s] != c) {
//				System.out.println("set");
				System.out.println(-1);
				sc.close();
				return;
			}
			
			num[s] = c;
		}
		
		String ans = "";
		for (int i = 1; i < n + 1; i++) {
			ans += Math.max(num[i], 0);
		}
		
		if (ans.charAt(0) == '0' && n > 1) {
//			System.out.println("top0");
			System.out.println(-1);
			sc.close();
			return;
		}
		
		System.out.println(ans);
		
		sc.close();
	}

}
