import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		int l = 1;
		int r = n;

		for (int i = 1; i <= m; i++) {
			int tl = Integer.parseInt(sc.next());
			int tr = Integer.parseInt(sc.next());

			if (l < tl) l = tl;
			if (tr < r) r = tr;
		}

		if (r < l) {
			System.out.println(0);
		} else {
			System.out.println(r - l + 1);
		}

		sc.close();
	}
}