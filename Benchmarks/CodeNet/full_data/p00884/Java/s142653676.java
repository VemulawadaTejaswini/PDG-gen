

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main 
{
	static HashMap<String, String> groupdef;
	static String firstgroup;
	static TreeSet<String> members;
	static TreeSet<String> checked;
	
	static void get(String g)
	{
		String con = groupdef.get(g);
//		System.out.println("Getting " + g + "...");
		if(checked.contains(g))return;
		
		int start = 0;
		int mem = 0;
		for(int i = 0; i < con.length(); i++)
		{
			if(con.charAt(i) == ',' || con.charAt(i) == '.')
			{
				String word = con.substring(start, i);
				start = i+1;
				
				if(groupdef.containsKey(word))
				{
					get(word);
				}
				else
				{
					members.add(word);
				}
			}
		}
		checked.add(g);
//		cache.put(g, mem);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			int n = sc.nextInt();
			if(n == 0)break;
			groupdef = new HashMap<String, String>();
//			cache = new HashMap<String, Integer>();
			members = new TreeSet<String>();
			
			for(int i = 0; i < n; i++)
			{
				String s = sc.next();
				int lim = s.indexOf(':');
				String groupname = s.substring(0, lim);
				String groupcon = s.substring(lim+1);
				if(i == 0)firstgroup = groupname;
				groupdef.put(groupname, groupcon);
			}
			
			get(firstgroup);
			System.out.println(members.size());
//			System.out.println(members);
		}
		

	}

}

