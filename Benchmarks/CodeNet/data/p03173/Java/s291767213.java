import java.util.*;

public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    PriorityQueue<Long> pq =
      new PriorityQueue<Long>(); 
    int n=sc.nextInt();
    long a[]=new long[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextLong();
      pq.add(a[i]);
    }
    long sum=0;
    for(int i=0;i<n-1;i++)
    {
      long val1=pq.poll();
      long val2=pq.poll();
      long result=val1+val2;
      sum+=result;
      pq.add(result);
    }
    System.out.println(sum);
  }
}