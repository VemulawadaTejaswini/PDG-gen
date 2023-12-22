import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    	Scanner s=new Scanner(System.in);
    	int n=s.nextInt();
    	int x=s.nextInt();
    	int t=s.nextInt();
    	int k=(int)(t*Math.ceil((double)n/x));
    	System.out.println(k);
  }
}