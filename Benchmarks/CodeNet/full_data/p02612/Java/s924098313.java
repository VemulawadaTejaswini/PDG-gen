import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  int k=n%1000;
	  if(k==0)
	  System.out.println("0");
	  else
	  System.out.println((1000-k));
	
	}
}