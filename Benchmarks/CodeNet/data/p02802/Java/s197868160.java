import java.util.*;
class Solution
{
  public static void main(String[] arhsas)
  {
    int n,m;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    m=sc.nextInt();
    Map<Integer,Stack<String>> map=new HashMap<Integer,Stack<String>>();
    for(int i=0;i<m;i++)
    {
      int q=sc.nextInt();
      Stack<String> s=map.get(q);
      if(s==null)
      {
        s=new Stack<String>();
        String str=sc.next();
        s.push(str);
      }
      else
      {
        String str=sc.next();
        s.push(str);
      }
    }
    int cor=0,incor=0;
    for (Map.Entry<Integer,Stack<String>> entry : map.entrySet())
    {
      Stack<String> s=entry.getValue();
      int tempcor=0,tempincor=0;
      while(s.size()!=0)
      {
        String str=s.peek();
        if(str.equals("WA"))
        {
          tempincor++;
          //tempcor=0;
        }
        else
        {
          tempcor=1;
          tempincor=0;
        }
        s.pop();
      }
      cor+=tempcor;;incor+=tempincor;
    }
  System.out.println(cor+" "+incor);  
  }
}