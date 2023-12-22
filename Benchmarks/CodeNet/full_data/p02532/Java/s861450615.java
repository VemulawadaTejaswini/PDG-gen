import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		List<String> ans = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		for(int i = 0; i < num; ++i)
		{
			list.add(new ArrayList<String>());
		}
		String str;
		while(!(str = sc.next()).equals("quit"))
		{
			if(str.equals("pop"))
			{
				int a = sc.nextInt();
				--a;
				ans.add((String)list.get(a).get(list.get(a).size() - 1));
				list.get(a).remove(list.get(a).size() - 1);
			}
			else if(str.equals("push"))
			{
				int a = sc.nextInt();
				String c = sc.next();
				--a;
				list.get(a).add(c);
			}
			else if(str.equals("move"))
			{
				int a = sc.nextInt();
				int b = sc.nextInt();
				--a; --b;
				list.get(b).add(list.get(a).get(list.get(a).size() - 1));
				list.get(a).remove(list.get(a).size() - 1);
			}
		}
		Iterator<String> it = ans.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}