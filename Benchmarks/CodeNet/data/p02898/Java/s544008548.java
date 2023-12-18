import java.util.*;
class Sol
{
  public static void main(String aargs[])
  {
    int n,k,cntr=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    k=sc.nextInt();
    for(int i=0;i<n;i++)
    {
      if(sc.nextInt()>=k)
        cntr++;
    }
    System.out.print(cntr);
  }
}