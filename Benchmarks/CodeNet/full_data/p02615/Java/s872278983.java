import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long sum=0;
    for(int i=0;i<n;i++)
    {
      sum=sum+sc.nextLong();
    }
    System.out.println(sum-1);
  }
}
