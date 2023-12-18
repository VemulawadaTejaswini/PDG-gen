import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=i+1;
    for(int i=0;i<(int)(n/2);i++)
    {
      System.out.println(arr[i]+" "+arr[arr.length()-1-i]);
    }
  }
}