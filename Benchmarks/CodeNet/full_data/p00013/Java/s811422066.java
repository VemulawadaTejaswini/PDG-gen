import java.util.ArrayList;
import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
	
		ArrayList<Integer> in = new ArrayList<Integer>();
		for(; scanner.hasNext();)
		{
			int n = scanner.nextInt();
			if(n == 0)
			{
				System.out.println(in.get(in.size()-1));
				in.remove(in.size()-1);
			}
			else
			{
				in.add(n);
			}
		}
	}
}