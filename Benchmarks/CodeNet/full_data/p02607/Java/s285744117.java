import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ans=0;
    for( int i=1;i<=n;i++)
    {
      int x=sc.nextInt();
      if((x%2!=0)&&(i%2!=0))
        ans++;
    }
    System.out.println(ans);
  }
}