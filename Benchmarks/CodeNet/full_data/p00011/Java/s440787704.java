import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] s = new int[w];
		for (int i = 0; i < w; i++) {
			s[i] = i + 1;
		}
		for (int i = 0; i < n; i++) {
			String line = sc.next();
			String[] ss = line.split(",");
			int a = Integer.parseInt(ss[0]);
			int b = Integer.parseInt(ss[1]);
			int c = s[a - 1];
			s[a - 1] = s[b - 1];
			s[b - 1] = c;
		}
		for (int i = 0; i < w; i++) {
			System.out.println(s[i]);
		}
	}
}