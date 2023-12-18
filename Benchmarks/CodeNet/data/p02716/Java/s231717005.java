import java.util.*;
class Main
{
  public static void main(String args[])
  {
    long max=Long.MIN_VALUE;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long s=0;
    long a[]=new long[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextLong();
    }
    if(n%2==0)
    {
      	for(int j=0;j<2;j++)
        {
    		for(int i=j;i<n;i+=2)
       		 {
                s+=a[i];
           	 }
          max=Math.max(max,s);
          s=0;
        }
    }
    else
    {
      long sum1=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0;
      for(int i=2;i<n-2;i+=2)
      {
        sum1=a[0]+a[i];
      }
      for(int i=3;i<n-1;i+=2)
      {
        sum2=a[0]+a[i];
      }
      for(int i=4;i<n;i+=2)
      {
        sum3=a[0]+a[i];
      }
      for(int i=3;i<n-1;i+=2)
      {
        sum4=a[1]+a[i];
      }
      for(int i=4;i<n;i+=2)
      {
        sum5=a[2]+a[i];
      }
      max=Math.max(max,Math.max(sum1,Math.max(sum2,Math.max(sum3,Math.max(sum4,sum5)))));
                                                                          }                                                                    
                                                                          
      System.out.println(max);
              
          
         
  }
}