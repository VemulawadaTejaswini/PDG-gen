import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int n = scan.nextInt();
		int[] s = new int[w + 1];
		for (int i = 0; i < w; i++) {
			s[i] = i + 1;
		}
		s[w] = 0;
		for (int j = 0; j < n; j++) {
			String str = scan.next();
			String[] ab = str.split(",");
			int a = Integer.parseInt(ab[0]);
			int b = Integer.parseInt(ab[1]);
			s[w] = s[a - 1];
			s[a - 1] = s[b - 1];
			s[b - 1] = s[w];
		}
		for (int k = 0; k < w; k++) {
			System.out.println(s[k]);
		}
	}
}