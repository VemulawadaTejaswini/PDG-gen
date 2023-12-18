import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] p = new int[a];
		int[] q = new int[b];
		int[] r = new int[c];
		for (int i = 0; i < a; i++) {
			p[i] = sc.nextInt();
		}
		for (int i = 0; i < b; i++) {
			q[i] = sc.nextInt();
		}
		for (int i = 0; i < c; i++) {
			r[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(p);
		Arrays.sort(q);
		Arrays.sort(r);

		int[] apple = new int[x + y + c];

		for (int i = 0; i < x; i++) {
			apple[i] = p[a - 1 - i];
		}
		for (int i = 0; i < y; i++) {
			apple[x + i] = q[b - 1 - i];
		}
		for (int i = 0; i < c; i++) {
			apple[x + y + i] = r[i];
		}

		Arrays.sort(apple);
		long taste = 0;

		for (int i = 0; i < x + y; i++) {
			taste = taste + apple[x + y + c - 1 - i];
		}
		print(taste);

	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
