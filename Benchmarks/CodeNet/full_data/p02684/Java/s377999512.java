import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long k=(sc.nextLong()%(long)n);
    int ar[]=new int[n];
    int ans=0;
    int start=-1;
    for(int x=0;x<n;x++)
    {
      ar[x]=sc.nextInt()-1;
    }
    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
      int i=0;
      int l=0;
      while(true)
      {
        int d=ar[i];   
          l++;
        if(map.containsKey(i))
        {
            break;
        }
          else
          {
              map.put(i,0);
          }
      i=d;
      }
      int d=(int)(k%(long)l);
      i=0;
      for(int x=0;x<d+1;x++)
      {
          i=ar[i];
      }
      System.out.println(i+1);
  }
}