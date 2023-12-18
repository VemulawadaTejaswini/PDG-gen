import java.util.*;
public class MyClass
{
    public static void main(String args[]) 
    {
      Scanner sc=new Scanner(System.in);
      long n=sc.nextInt();
      HashMap<Long,Long> map=new HashMap<>();
      while(n-->0)
      {
          long a=sc.nextInt();
          if(map.containsKey(a))
          {
              long c=map.get(a);
              map.put(a,c+1);
          }
          else
          {
              map.put(a,1);
          }
      }
      long sum=0;
      for(Map.Entry<Long,Long> entry:map.entrySet())
      {
          if(entry.getKey()!=entry.getValue())
          {
             if(entry.getValue()>entry.getKey())
             {
                 sum+=entry.getValue()-entry.getKey();
             }
             else
             {
                 sum+=entry.getValue();
             }
          }
      }
      System.out.print(sum);
    }
}