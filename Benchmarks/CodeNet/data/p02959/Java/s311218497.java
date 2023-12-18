import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		int ans = 0;
		ArrayList<Integer> city = new ArrayList<Integer>();
		ArrayList<Integer> hero = new ArrayList<Integer>();
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		for (int i = 0; i <= n; i++) {
			int a = read.nextInt();
			city.add(a);
		}
		for (int i = 0; i < n; i++) {
			int b = read.nextInt();
			hero.add(b);
		}
		for (int i = 0; i < n; i++) {
			for (int j = i; j <= i + 1; j++) {
				int small = Math.min(city.get(j), hero.get(i));
				ans += small;
				city.set(j, city.get(j) - small);
				hero.set(i, hero.get(i) - small);
			}
		}
		System.out.println(ans);
	}
}