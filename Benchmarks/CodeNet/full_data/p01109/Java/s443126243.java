
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			int n = scan.nextInt();
			float sum = 0;
			
			if(n == 0) {break;}
				
			List<Integer> l = new ArrayList<Integer>();
			
			for(int i = 0; i < n; i++)
			{
				int input = scan.nextInt();
				l.add(input);
				sum += input;
			}
			
			float avg = sum/n;
			int ans = 0;
			for(int x : l)
			{
				if(x <= avg)
				{
					ans += 1;
				}
			}
			System.out.println(ans);
		}
		
	}

}

