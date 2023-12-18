import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    int min=Integer.MAX_VALUE/2;
    for(int i=-100;i<=100;i++)
    {
      int sum=0;
      for(int j=0;j<n;j++)
      {
        sum+=(arr[j]-i)*(arr[j]-i);
      }
      min=Math.min(sum,min);
    }
    System.out.println(min);
  }
}