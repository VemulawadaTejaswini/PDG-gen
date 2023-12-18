import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] v = new int[n];
		Arrays.fill(v, -1);
		
		for (int i = 0; i < m; i++) {
			int s = sc.nextInt() - 1;
			int c = sc.nextInt();
			
			if (n > 1 && s + c == 0 || v[s] >= 0 && v[s] != c) {
				System.out.println(-1);
				sc.close();
				return;
			}
			
			v[s] = c;
		}
		
		for (int i = 0; i < n; i++) {
			if (v[i] == -1) {
				v[i] = i == 0 && n > 1 ? 1: 0;
			}
		}
		
		String ans = Arrays.toString(v).replaceAll("\\D", "");
		System.out.println(ans);
		sc.close();
	}

}
