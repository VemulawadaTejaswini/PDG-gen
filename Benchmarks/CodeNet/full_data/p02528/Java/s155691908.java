import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; ++i)
		{
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		for(int i = 0; i < n - 1; ++i)
		{
			System.out.print(list.get(i) + " ");
		}
		System.out.println(list.get(n - 1));
	}
}