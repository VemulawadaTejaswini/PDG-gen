import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		List<String> ans = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		String str;
		while(!(str = sc.next()).equals("quit"))
		{
			if(str.equals("pop"))
			{
				ans.add(list.get(list.size() - 1));
				list.remove(list.size() - 1);
				continue;
			}
			if(str.equals("push"))
			{
				String c = sc.next();
				list.add(c);
			}
		}
		Iterator<String> it = ans.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}