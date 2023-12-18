import java.util.Scanner;
import java.util.TreeSet;

// Java8
public class Main
{
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception
	{
		new Main().run();
	}

	void run()
	{
		int n = nint();
		int[] b = new int[n+1];
		for(int i=1; i<=n; i++)
		{
			int a = nint();
			b[a] = i;
		}
		TreeSet<Integer> set = new TreeSet<>();
		set.add(0);
		set.add(n+1);
		long sum = 0;
		for(int i=1; i<=n; i++)
		{
			int c = b[i];
			int lower = set.lower(c);
			int higher = set.higher(c);
			sum += ((long)i) * (c - lower) * (higher - c);
			set.add(c);
		}
		System.out.println(sum);

	}

	int nint()
	{
		return Integer.parseInt(sc.next());
	}

}