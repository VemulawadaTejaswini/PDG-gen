import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Integer> a = new TreeSet<Integer>();
		for (int i = 0; i < n; i++)
			a.add(sc.nextInt());
		sc.close();

		int ans = a.ceiling(a.last() / 2);
		if (ans - a.last() / 2 > a.last() / 2 - a.floor(a.last() / 2))
			ans =  a.floor(a.last() / 2);
		if (ans == a.last())
			ans = a.lower(a.last());
		System.out.println(a.last() + " " + ans);
	}
}