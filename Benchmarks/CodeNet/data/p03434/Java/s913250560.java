
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<String, Integer> m = new HashMap<>();

		int n = Integer.parseInt(sc.nextLine());

		String str = sc.nextLine();
		String sl[] = str.split(" ");
		int a[] = new int[200];

		for(int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(sl[i]);
		}

		Arrays.sort(a);

		int s = 0;
		int t = 0;
		for(int i = 0; i < 200; i += 2)
		{
			s += a[i];
		}
		for(int i = 1; i < 200; i += 2)
		{
			t += a[i];
		}

		System.out.println(Math.abs(t - s));
	}
}