import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int n = sc.nextInt(),
				m = sc.nextInt();
			if (n == 0 && m == 0) break;
			ArrayList<HashSet<Integer>> friends = new ArrayList<HashSet<Integer>>(n);
			for (int i = 0; i < n; i++) friends.add(new HashSet<Integer>());
			for (int i = 0; i < m; i++)
			{
				int a = sc.nextInt() - 1,
					b = sc.nextInt() - 1;
				friends.get(a).add(b);
				friends.get(b).add(a);
			}
			HashSet<Integer> invite = new HashSet<Integer>();
			invite.add(0);
			Iterator<Integer> it0 = friends.get(0).iterator();
			while (it0.hasNext())
			{
				int a = it0.next();
				invite.add(a);
				Iterator<Integer> itx = friends.get(a).iterator();
				while (itx.hasNext())
				{
					invite.add(itx.next());
				}
			}
			System.out.println(invite.size() - 1);
		}
	}
}