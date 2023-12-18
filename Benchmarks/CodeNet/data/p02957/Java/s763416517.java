import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
    	int a=x.nextInt();
    	int b=x.nextInt();
    	if((a+b)%2!=0)
        {
          System.out.println("IMPOSSIBLE");
        }
    	else
    	{
          	System.out.println((a+b)/2);
        }
	}
}