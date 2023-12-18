import java.util.ArrayList;
import java.util.*;
  public class Main
{
	public static void main (String[] args)
	 {
		Scanner sc=new Scanner(System.in); 
		String s=sc.next();
		String s2=sc.next();
		if(s2.contains(s))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}