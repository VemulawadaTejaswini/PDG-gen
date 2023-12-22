import java.util.*;

public class VirtualMachineError
{
	public static void main(String[] args)
	{
		Scanner console = new Scnanner(System.in);
		int n = console.nextInt();
		int ac = 0;
		int wa = 0;
		int tle = 0;
		int re = 0;
		for(int i = 0; i < n; i ++)
		{
			String temp = console.next();
			if(temp.equals("AC"))
			{
				ac ++;
			}
			else if(temp.equals("WA"))
			{
				wa ++;
			}
			else if(temp.equals("tle"))
			{
				tle ++;
			}
			else
			{
				re ++;
			}
		}
		System.out.println("AC  X  " + ac);
		System.out.println("WA  X  " + wa);
		System.out.println("TLE  X  " + tle);
		System.out.print("RE  X  " + re);		
	}
}
