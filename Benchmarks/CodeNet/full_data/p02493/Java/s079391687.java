import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int i = 0; i < size; ++i)
		{
			list.add(sc.nextInt());
		}
		for(int i = size - 1; i > 0; --i)
		{
			System.out.print(list.get(i) + " ");
		}
		System.out.println(list.get(0));
	}
}