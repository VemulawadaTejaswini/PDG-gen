// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	    String s = "";
	    for(int i=1;i<=n;i++)
	        s+=Integer.toString(i);
	    String s1 = "";
	    for(int i=1;i<=n;i++)
	    {
	        int a = input.nextInt();
	        s1+=Integer.toString(a);
	    }
	    String s2 = "";
	    for(int i=1;i<=n;i++)
	    {
	        int a = input.nextInt();
	        s2+=Integer.toString(a);
	    }
	    List<String> list = new ArrayList<>();
	    list = permutations(s);
	    Collections.sort(list);
	    System.out.println(Math.abs(list.indexOf(s1)-list.indexOf(s2)));
	}
	
	
	
	public static List<String> permutations(String s)
	{
		List<String> partial = new ArrayList<>();
		partial.add(String.valueOf(s.charAt(0)));
		for (int i = 1; i < s.length(); i++)
		{
			for (int j = partial.size() - 1; j >= 0 ; j--)
			{
				// remove current partial permutation from the ArrayList
				String str = partial.remove(j);
				for (int k = 0; k <= str.length(); k++)
				{
					partial.add(str.substring(0, k) + s.charAt(i) + 
								str.substring(k));
				}
			}
		}

		return partial;
	}
}