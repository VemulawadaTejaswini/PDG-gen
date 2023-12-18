import java.util.*;
public class MyClass
{
    public static void main(String args[]) 
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      HashMap<Integer,Integer> map=new HashMap<>();
      while(n-->0)
      {
          int a=sc.nextInt();
          if(map.containsKey(a))
          {
              int c=map.get(a);
              map.put(a,c+1);
          }
          else
          {
              map.put(a,1);
          }
      }
      int sum=0;
      for(Map.Entry<Integer,Integer> entry:map.entrySet())
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