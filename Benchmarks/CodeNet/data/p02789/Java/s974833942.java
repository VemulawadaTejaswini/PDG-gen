import java.util.*;
public class code
{
  	public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int n,m;
      n=in.nextInt();
      in.nextLine();
      m=in.nextInt();
      if(n==m)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
}