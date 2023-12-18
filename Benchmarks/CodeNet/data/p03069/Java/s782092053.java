import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();
		int min = 0;
		int shoki = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) != '#') {
				shoki++;
			}
		}
		min = shoki;
		int prev = shoki;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '.') {
				prev--;
			} else {
				prev++;
			}
			if (prev < min)
				min = prev;
		}
		System.out.println(min);
	}
}
