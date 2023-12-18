import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] num = new int[n + 1];
		int[] visited = new int[n + 1];
		
		Arrays.setAll(num, i -> -1);
		
		for (int i = 0; i < m; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();
			if (visited[s] == 1 && num[s] != c) {
//				System.out.println("visited");
				System.out.println(-1);
				sc.close();
				return;
				
			}
			num[s] = c;
			visited[s] = 1;
		}
		
		String ans = "";
		for (int i = 1; i < num.length; i++) {
			if (i == 1 && num[i] == -1) {
				ans += "1";
			} else {
				ans += Math.max(num[i], 0);
			}
		}
		
		System.out.println(ans);
		
		sc.close();
	}

}
