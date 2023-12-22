import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		List<Integer> li=new ArrayList<>();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='R')
			{
				count++;
			}
			else
			{
				li.add(count);
				count=0;
			}
		}
      if(count>0)
      {
        li.add(count);
      }
		Collections.sort(li,Collections.reverseOrder());
		System.out.println(li.get(0));
	}

}
