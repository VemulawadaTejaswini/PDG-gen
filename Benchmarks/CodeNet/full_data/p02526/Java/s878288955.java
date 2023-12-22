import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> S = new TreeSet<Integer>();
		for(int i = 0; i < n; ++i)
		{
			S.add(sc.nextInt());
		}
		int ans = 0;
		int q = sc.nextInt();
		for(int j = 0; j < q; ++j)
		{
			int T = sc.nextInt();
			if(S.contains(T))
			{
				++ans;
			}
		}
		System.out.println(ans);
	}
}