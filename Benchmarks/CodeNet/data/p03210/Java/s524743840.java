import java.lang.reflect.Array;
import java.math.*;
import java.util.*;
public class Main
{
	static Scanner sc=new Scanner(System.in);
	static final int MAX=100000+5;
	public static void main(String[] args)
	{
		int n=sc.nextInt();
		if(n==3||n==5||n==7)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}