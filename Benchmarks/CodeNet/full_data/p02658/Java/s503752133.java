using System;
using System.Linq;

public class Test
{
	public static void Main()
	{
		
		int n = int.Parse(Console.ReadLine());
		var a = Console.ReadLine().Split().Select(y => long.Parse(y)).ToArray();
		long ans = 1;
		
		for(int i=0;i!=n;i++){
			ans *= a[i];
		}
		if(ans>1000000000000000000){
			ans = -1;
		}
		Console.WriteLine(ans);
		
	}
}