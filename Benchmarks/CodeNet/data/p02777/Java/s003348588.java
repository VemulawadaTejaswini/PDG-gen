import java.util.*;
 
public class Main
{
  public static void main(String[] args)
  {
    Scanner scan1 = new Scanner(System.in);
	scan1.nextLine();
 
	int redCount = scan1.nextInt();
	int blueCount = scan1.nextInt();
 
	String subtract = scan1.nextLine();
 
	if(subtract.equals("red"))
	{
 	 redCount-=1;
	}
	else
 	 blueCount-=1;
 
	System.out.println(redCount + "" + blueCount);
  }
}