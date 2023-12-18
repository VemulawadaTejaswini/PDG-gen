import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextInt();
		long y = sc.nextInt();
		long a = 1;
		boolean e = false;
		for (int i = 1; i <= 18; i++)
			a = a * 10;
		if (x != y) {
			int i = 1;
			while (x * i < y)
				i++;
			for (; x*i <= a; i++) {
				if (((x*i) % y) != 0 && !e) {
					System.out.println(x*i);
					e = true;
					break;
				}
			}
		}
		if (!e)
			System.out.println("-1");
	}
}
