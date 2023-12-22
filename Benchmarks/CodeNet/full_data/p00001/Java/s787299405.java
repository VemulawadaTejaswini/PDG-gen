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
		Collections.sort(list, new MyComparator());
		for(int i = 0; i < 3; ++i)
		{
			System.out.println(list.get(i));
		}
	}
}

class MyComparator implements java.util.Comparator<Integer>
{
	public int compare(Integer object1, Integer object2)
	{
        return((object1).compareTo(object2) * -1);	//降順
    }
}