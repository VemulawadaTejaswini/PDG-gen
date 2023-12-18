import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int plus=a+b;
		int minus=a-b;
		int z=a*b;
		
		int max=Math.max(Math.max(plus,minus),z)
			
		System.out.println(max);
	}
}