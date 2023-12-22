import java.util.*;
import java.lang.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
    long sum=0;
    for(int i=0;i<n;i++)
    {
      int val=sc.nextInt();
      m.put(val,m.getOrDefault(val,0)+1);
      sum+=val;
    }
    int q=sc.nextInt();
    for(int j=0;j<q;j++)
    {
      int b=sc.nextInt();
      int c=sc.nextInt();
      if(m.containsKey(b))
      {
        int num=m.get(b);
        m.remove(b);
        m.put(c,m.getOrDefault(c,0)+num);
        int x=num*b;
        int y=num*c;
        sum=sum-x+y;
        System.out.println(sum);
      }
      else
      {
        System.out.println(sum);
      }
    }
  }
}
