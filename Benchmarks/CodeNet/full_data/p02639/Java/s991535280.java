import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in); 
    int[] n  = new int[5];
    int r = 0;
    
    for(int i = 0; i < n; i++)
    {
    	n[i] = sc.nextInt();
    	if(n[i] == 0)
    	{
    		r = i + 1;
    	}
    }
    System.out.println(r);
	sc.close();
  }
}                          
