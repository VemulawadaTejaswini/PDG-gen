import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int k = in.nextInt();
		solve(n, k);
		in.close();
	}
 
	private static void solve(int n, int k) {
		int x = (n - 1) * (n - 2) / 2;
		if (k > x) {
			System.out.println(-1);
			return;
		}
      
      	System.out.println(n - 1 + x - k);
		for (int i = 2; i <= n; i++)
			System.out.println(1 + " " + i);
 
		for (int i = 2; i < n; i++)
			for (int j = i + 1; j <= n; j++) {
				if (k == x)
					return;
				x--;
				System.out.println(i + " " + j);
			}
	}
}