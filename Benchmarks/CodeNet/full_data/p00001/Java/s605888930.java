import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 10; ++i)
		{
			int a = stdIn.nextInt();
			list.add(a);
		}
		Collections.sort(list, new IntComparator());
		for(int i = 0; i < 3; ++i)
		{
			System.out.println(list.get(i));
		}
	}
}

class IntComparator implements Comparator 
{
	  public int compare(Object o1, Object o2) 
	  {
	    int s1 = (int)o1;
	    int s2 = (int)o2;
	    return (-Integer.valueOf(s1).compareTo(Integer.valueOf(s2))); //降順
	  }
}