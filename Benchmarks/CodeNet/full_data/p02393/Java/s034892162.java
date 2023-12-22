import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		List<Integer> a = new ArrayList<Integer>();	
		for(int i = 0; i < 3; ++i)
		{
			a.add(sc.nextInt());
		}
		Collections.sort(a);
		for(int i = 0; i < 2; ++i)
		{
			System.out.printf("%d ", a.get(i));
		}
		System.out.println(a.get(2));
	}
}