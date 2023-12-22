import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int c=0;
    for(int j=0;j<n;j++)
      {
       a[j]=sc.nextInt();
       
      //System.out.println(a[1][j]);
      }
    for(int i=0;i<n;i++)
      {
        int b=a[i];
      //System.out.println(b);
     
        for(int j=i+b;j<n;j++)
        {
          //System.out.println(j);
          if((Math.abs(i-j)==(a[i]+a[j])))
          {
            c++;
             //System.out.println(a[i]+" "+a[j]);
    
            
          }
        }
      }
    
      System.out.println(c);
    
  }
}