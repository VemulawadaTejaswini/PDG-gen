import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int index=1;
    int x=0;
    while(k>=0)
    {
     	x=a[index-1];
     	index=x;
      k--;
    }
    System.out.println(index);
  }
}