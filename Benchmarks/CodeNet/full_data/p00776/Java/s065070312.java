

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	static int num = 0;
	static int pointer = 0;
	static List<String> list = new ArrayList<String>();
	
	static void f(String s, int prog, boolean[] startused)
	{
//		System.out.println("attempting " + s + " " + prog);
		if(prog >= s.length())
		{
			num += 1;
			list.add(s);
			return;
		}
		
		String cur = s.substring(prog,prog+1);
//		if(cur.equals("z")) {return;}
		
		boolean[] used = startused.clone();
		

		char ccur = cur.charAt(0);
		int let = ccur-97;
		
		if(cur.equals("a"))
		{
//			System.out.println("Case A");
			if(!startused[0]) //the first a, could actually be a or b.
			{
				f(s, prog+1, used);
				
				//the converted one (originally c)
				char conv = (char)((int)ccur+1);
				used[let+1] = true;
				
				String newS = s.substring(0, prog) + String.valueOf(conv);
				if(prog < s.length()-1)
				{
					newS += s.substring(prog+1);
				}
//				System.out.println("Looking at the b: " + newS);
				f(newS, prog+1, used);
				return;				
			}
			else
			{ //the second a. makes it impossible.
				return;
			}
		}
		else
		{ //has that letter already came?
			//if not, the letter must've been converted.
//			if(let == 0) {System.out.println("ERROR: " + cur);}
			if(startused[let] == false) //in case of b: a -> b? if not, this was originally c.?
			{ //in case of z it would be: y -> z? if not, impossible.
				if(cur.equals("z")) {return;}
				if(startused[let+1]) {return;}
				char conv = (char)((int)ccur+1);
				used[let+1] = true;
				
				String newS = s.substring(0, prog) + String.valueOf(conv);
				if(prog < s.length()-1)
				{
					newS += s.substring(prog+1);
				}
				f(newS, prog+1, used);
				return;
			}
			else
			{ //if yes, the letter 
//				System.out.println("startused" + (let+1) + ": " + startused[let+1]);
				if(cur.equals("z"))
				{
//					System.out.println("ZZZ");
					if(startused[25]) // y -> z?
					{
						f(s, prog+1, used);
						return;
					}
					else
					{
						return;
					}
				}				
				if(startused[let+1] == true) //b -> c? if yes, then b. otherwise, could be both.
				{
					f(s, prog+1, used);
					return;
				}
				else
				{
					boolean prev = used[let]; //
					System.out.println("[DEBUG] " + prev);
					used[let] = true; //
					f(s, prog+1, used);
					used[let] = prev;//
					
					//the converted one (originally c)
					char conv = (char)((int)ccur+1);
					used[let+1] = true;
					
					String newS = s.substring(0, prog) + String.valueOf(conv);
					if(prog < s.length()-1)
					{
						newS += s.substring(prog+1);
					}
					f(newS, prog+1, used);
					
					return;
				}
			}
		}
		
	}

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			String s = scan.nextLine();
			
			if(s.equals("#"))
			{
				break;
			}
			else
			{
				boolean[] startused = new boolean[26];
				list = new ArrayList<String>();
				num = 0;
				f(s,0, startused);
				
				System.out.println(num);
				
				if(list.size() <= 10)
				{
					for(String ss : list)
					{
						System.out.println(ss);
					}
				}
				else
				{
					for(int i = 0; i < 5; i++)
					{
						System.out.println(list.get(i));
					}
					for(int i = list.size()-5; i < list.size(); i++)
					{
						System.out.println(list.get(i));
					}
				}
				
			}
		}
	}

}

