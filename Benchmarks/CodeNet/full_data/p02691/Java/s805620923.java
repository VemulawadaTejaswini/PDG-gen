import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n+1];
    int l[]=new int[n+1];
    int r[]=new int[n+1];
    int c=0;
    for(int j=1;j<=n;j++)
      {
       a[j]=sc.nextInt();
      l[j]=a[j]+j;
       r[j]=Math.abs(j-a[j]);
      
      }
    for(int i=1;i<n;i++)
      {  
        for(int j=i+1;j<=n;j++)
        {
          if(l[i]==r[j])
          {
            System.out.println(l[i]+" "+r[j]);
            c++;
          }
        }
    }
    
      System.out.println(c);
    
  }
}