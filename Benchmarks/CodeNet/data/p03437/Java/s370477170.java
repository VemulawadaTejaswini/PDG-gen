import java.io.*;
import java.util.*;
class Main
{
	public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	int x = s.nextInt();
	int y = s.nextInt();
	if(x>y && x%y ==0)
	System.out.println("-1");
	else
	System.out.println(x*(y-1));

	}
}