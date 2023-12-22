import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static int a;
	static int b;
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		List<Sub> subs = new ArrayList<Sub>();
		
		subs.add(new Sub(0));
		subs.add(new Sub(1));
	}

	static class Sub
	{
		int i;
		
		public Sub(int role)
		{
			Scanner scanner2 = new Scanner(System.in);
			
			if(role==0)
			{
				a = scanner2.nextInt();
				b = scanner2.nextInt();
			}
			
			if(role==1)
			{
				System.out.println(a*b + " " + (a+b)*2);
			}
			
		}
	}
}

