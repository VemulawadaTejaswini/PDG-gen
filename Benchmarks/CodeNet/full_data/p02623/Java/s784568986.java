import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    
    int m = sc.nextInt();
    int N = n1+n2;
    int[] a = new int[N];
    for(int i=0;i<N;i++)
    {
      a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    int count=0;
    if(m>a[0]||m==a[0])
    {
      int sum=0;
      for(int i=0;i<N;i++)
      {
        sum=sum+a[i];
        if(sum < m || sum==m)
         count++;
      }
    }
    System.out.println(count);
    
  }
}