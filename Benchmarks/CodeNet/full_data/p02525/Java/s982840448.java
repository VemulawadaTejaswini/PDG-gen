import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int n = sc.nextInt();
			if(n == 0)
			{
				break;
			}
			List<Integer> s = new ArrayList<Integer>();
			int sum = 0;
			for(int i = 0; i < n; ++i)
			{
				s.add(sc.nextInt());
				sum += s.get(i);
			}
			double average = (double)sum / n;
			double temp = 0;
			for(int i = 0; i < n; ++i)
			{
				temp += (s.get(i) - average) * (s.get(i) - average);
			}
			System.out.println(Math.sqrt(temp / n));
		}
	}
}