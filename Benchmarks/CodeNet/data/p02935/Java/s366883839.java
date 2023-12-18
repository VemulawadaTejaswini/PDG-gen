import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> v = new ArrayList<Integer>();

		for(int i = 0 ; i < n ; i++){
			v.add(sc.nextInt());
		}

		Collections.sort(v);

		double ans = v.get(0);
		for(int i = 1 ; i < n ; i++){
			ans = (ans + v.get(i)) / 2;
		}

		System.out.println(ans);
	}
}