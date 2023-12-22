import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		int a, b;
		while ((n = in.nextInt()) != 0) {
			a = 0;
			b = 0;
			for (int i = 0; i < n; i++) {
				int pa = in.nextInt();
				int pb = in.nextInt();
				if (pa > pb) {
					a += (pa + pb);
				} else if (pa < pb) {
					b += (pa + pb);
				} else {
					a += pa;
					b += pb;
				}
			}
			System.out.println(a + " " + b);
		}
	}
}