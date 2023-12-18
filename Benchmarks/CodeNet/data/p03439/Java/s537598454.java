import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0;
		int y = n / 2;
		if(!judge(x, y))
			judge(y - 1, n - 1);
	}
	public static boolean judge (int x, int y) {
		Scanner sc = new Scanner(System.in);
		String a;
		String b;
		System.out.println(x);
		a = sc.next();
		if (a.equals("Vacant"))
			return true;
		System.out.println(y);
		b = sc.next();
		if (b.equals("Vacant"))
			return true;
		int c = a.compareTo(b);
		if (c == 0) {
			System.out.println((x + y) / 2);
			if (sc.next().equals("Vacant"))
				return true;
			if (!judge(x, y / 2 + 1))
				return judge(y / 2 + 1, y);
		}
		return false;
	}
}
