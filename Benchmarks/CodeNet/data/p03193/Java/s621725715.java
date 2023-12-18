import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int h = sc.nextInt();
    int w = sc.nextInt();
    int ans=0;
    
    while(n-->0)
    {
      int a = sc.nextInt();
      int b = sc.nextInt();
      if(a>=h&&b>=w)
      {
        ans++;
      }
    }
    System.out.println(ans);
  }
}