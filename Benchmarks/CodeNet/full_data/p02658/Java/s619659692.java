import java.util.ArrayList;
import java.util.Scanner;

public class main {
 
 
 
	public static void main(String[] args) {
 
 
		Scanner myObj = new Scanner(System.in);
 
		long ans = sol(myObj);
		
		
		myObj.close();
		
		System.out.println(ans);
	}
	
	
	public static long sol(Scanner obj)
	{
		ArrayList<Long> arr = new ArrayList<>();
		
		long n = obj.nextLong();
		
		for(long i = 0; i < n; i++)
		{
			long num = obj.nextLong();
			if(num == 0)
				return 0;
			else
				arr.add(num);
		}
		long total = 1;
		long bound = (long)Math.pow(10.0, 18.0);
		
		for(long i = 0; i < n; i++)
		{
			if(total > bound)
				return -1;
			else
				total *= obj.nextLong();
		}
		return total;
	}
}