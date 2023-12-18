import java.util.*;
class Main
{
  static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    } 
    static int findGCD(int arr[], int n) 
    { 
        int result = arr[0]; 
        for (int i = 1; i < n; i++) 
            result = gcd(arr[i], result); 
  
        return result; 
    } 
  public static void main(String args[])
  {
    long sum=0;
    int a[]=new int [3];
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    for(int i=1;i<=k;i++)
    {
      for(int j=1;j<=k;j++)
      {
        for(int x=1;x<=k;x++)
        {
            a[0]=i;
          	a[1]=j;
          	a[2]=x;
        	sum+=findGCD(a,3);
        }
      }
    }
    System.out.println(sum);        
  }
}