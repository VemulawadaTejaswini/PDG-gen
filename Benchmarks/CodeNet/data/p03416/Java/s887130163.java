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
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int counter = 0;
		
		for(int i=x;i<=y;i++)
			if(getDigit(0,i)==getDigit(4,i)&&getDigit(1,i)==getDigit(3,i))
				counter++;
		
		System.out.println(counter);
		
		
		scan.close();		
	}
}
