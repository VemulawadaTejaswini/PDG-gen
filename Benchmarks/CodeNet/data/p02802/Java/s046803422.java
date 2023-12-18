
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 問題数
		int m = sc.nextInt(); // 提出回数
		int[] ac = new int[n];
		int[] wa = new int[n];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			String s = sc.next();
			if (s.equals("AC") && ac[a - 1] == 0) {
				ac[a - 1]++;
				continue;
			}
			if (s.equals("WA") && ac[a - 1] == 0) {
				wa[a - 1]++;
			}
		}
		
		int sumA = 0;
		int sumB = 0;
		for (int i = 0; i < n; i++) {
			sumA += ac[i];
			if (ac[i] > 0) {
				sumB += wa[i];
			}
		}
		
		System.out.println(sumA);
		System.out.println(sumB);
	}
}
