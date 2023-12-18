import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    
	    long n = sc.nextLong();
	    long x = sc.nextLong();
	    if( (n*500) >= x)
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}
