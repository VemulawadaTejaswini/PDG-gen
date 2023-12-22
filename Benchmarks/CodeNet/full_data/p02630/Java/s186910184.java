import java.util.*;
class Main
{
 
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   
    int[] a = new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
   int t = sc.nextInt();
    while(t-- >0)
    {
      int b[0]=sc.nextInt();
      int b[1]=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        if(b[0]==a[i])
          a[i]=b[1];
      }
      int sum=0;
      for(int i=0;i<n;i++)
      {
        sum=sum+a[i];
      }
      System.out.println(sum);
    }
  }
}
   
   
