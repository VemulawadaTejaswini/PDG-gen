import java.util.*;
public class Main
{
  	public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int t = sc.nextInt();
      int i=0;
      int sum=0;
      for(i=0;i<t;i++)
        sum += sc.nextInt();
      if(sum < n)
        System.out.println("No");
      else
        System.out.println("Yes");
    }
}