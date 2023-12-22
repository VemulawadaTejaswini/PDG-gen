

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main
{

	static class C implements Comparator<Item>
	{

		@Override
		public int compare(Item arg0, Item arg1) 
		{
			if(arg0.num == true && arg1.num == false) return -1;
			else
			{
				if(arg0.num == true) 
				{
					return Integer.parseInt(arg0.con) - Integer.parseInt(arg1.con);
				}
				else
				{
					return arg0.con.compareTo(arg1.con);
				}
			}
			// TODO Auto-generated method stub
		}
	}
	
	static class Item implements Comparable<Item>
	{
		boolean num;
		String con;
		
		public Item(String t, boolean isnum)
		{
			con = t;
			num = isnum;
		}

		@Override
		public int compareTo(Item o) 
		{
			if(num == true && o.num == false) return -1;
			else
			{
				if(num == true) 
				{
					return Integer.parseInt(con) - Integer.parseInt(o.con);
				}
				else
				{
					return con.compareTo(o.con);
				}
			}
		}
	}
	
	static class Filename implements Comparable<Filename>
	{
		ArrayList<Item> con = new ArrayList<Item>();
		String text = "";
		
		public Filename(String t)
		{
			text = t;
			
			boolean num = true;
			boolean wasnum = true;
			int itemstartindex = 0;
			
			for(int i = 0; i <= t.length(); i++)
			{
//				System.out.println(i);
				if(i < t.length())
				{
					num = (t.charAt(i) >= '0' && t.charAt(i) <= '9');
				}
				else
				{
//					wasnum = (t.charAt(i) >= '0' && t.charAt(i) <= '9');
				}
				
				if(num != wasnum || i == 0 || i == t.length())
				{ //new item
//					System.out.println("NEW AT i = " + i);
//					if(i == t.length()-1)i++;
					//end previous item
					if(i > 0)
					{
						String itemc = t.substring(itemstartindex, i);
//						System.out.println("ADDING NEW ITEM " + itemc + " " + wasnum);
						con.add(new Item(itemc, wasnum));
					}
					itemstartindex = i;
					//new item
				}
				
				wasnum = num;
			}
		}

		@Override
		public int compareTo(Filename o) 
		{
			for(int i = 0; i < Math.min(con.size(), o.con.size()); i++)
			{
				Item i1 = con.get(i);
				Item i2 = o.con.get(i);
				int comp = i1.compareTo(i2);
				
				if(comp != 0)
				{
					return comp;
				}
			}
			
			return con.size() - o.con.size();
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		Filename f0 = new Filename(s);
		
		for(int i = 0; i < n; i++)
		{
			String in = sc.next();
			Filename f = new Filename(in);
			
			if(f.compareTo(f0) < 0)
			{
				System.out.println("-");
			}
			else
			{
				System.out.println("+");
			}
		}

	}

}

