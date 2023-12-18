import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int b = 0, w = 0;
		for (int i = 0; i < n; i++) {
			if (s[i] == '#') {
				b++;
			}
		}
		int min = s.length - b;
		for (int i = 0; i < n; i++) {
			if (s[i] == '#') {
				w++;
				b--;
				min = Math.min(min, s.length - b + w);
			}
		}
		if (min >= s.length / 2) {
			min = s.length - min;
		}
		System.out.println(min);
	}
}
