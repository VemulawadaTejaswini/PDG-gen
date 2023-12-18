import java.util.*;
class Main 
{ 

	
	 
	public static void main(String args[]) 
	{ 
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int count=0;
		while(b>=a && b>0 && c>0)
		{
			count++;
			b-=a;
			c-=1;
		}

		System.out.println(count);
		
		
	}
} 
