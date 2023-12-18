import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    int l=Sc.nextInt();
    int min=1+l-1;
    int max=n+l-1;
    int sum=0;
    for(int i=1;i<=n;i++)
    {
        sum=sum+(i+l-1);
        //System.out.println(sum);
    }
    if(min<=0&&max>=0)
    System.out.println(sum);
    else if(min>0)
    System.out.println(sum-min);
    else if(max<0)
    System.out.println(sum-max);
    
  }
}
