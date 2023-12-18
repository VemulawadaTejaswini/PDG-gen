import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    long n = input.nextLong();
    int g = 0;
    
    HashMap<Long,Long> map = new HashMap<>();
    
    for(long i=1;i<=n;i++)
    {
      if(n%i==0)
        map.put(i,n/i);
    }
    long sum=0;
    long min = (long)Integer.MAX_VALUE;
    for(long p:map.keySet())
    {
      
      sum = (p-1)+(map.get(p)-1);
      if(sum<min)
        min = sum;
      
    }
    System.out.println(min);
    
  }
}
