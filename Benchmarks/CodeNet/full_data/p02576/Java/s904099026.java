import java.util.*;
class main
{
  public static Scanner sc = new Scanner(System.in);
  public static void main(String[]args)
  {
    int n = sc.nextInt();
    int x = sc.nextInt();
    int t = sc.nextInt();
    
    int ans =0;
    while(n>0)
    {
      ans+=t;
      n=n-x;
    } 
    System.out.println(ans);
  }
}