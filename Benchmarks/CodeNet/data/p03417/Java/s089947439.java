	import java.util.*;
	
public class Main
{ 
	public static int getDigit(Integer i,Integer x)
	{
		return Integer.parseInt(x.toString().charAt(i)+"");
		
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		if(n==1)
			System.out.println(m==1 ? 1 : m-2);
		else if(m==1)
			System.out.println(n==1 ? 1 : n-2);
		else
			System.out.println((m-2)*(n-2));
		
		scan.close();		
	}
}
