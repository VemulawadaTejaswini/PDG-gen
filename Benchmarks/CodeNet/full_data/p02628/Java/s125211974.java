import java.util.*;
class Main
{
 
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m= sc.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    int sum=0;
    for(int i=0;i<m;i++)
    {
     sum=sum+a[i];
    }
    System.out.print(sum);
  }
   
  }