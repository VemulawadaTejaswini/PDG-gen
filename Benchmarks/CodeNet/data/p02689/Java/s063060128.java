import java.util.*;
import java.math.*;
class Main{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    ArrayList<Integer> a=new ArrayList<>();
    int n=in.nextInt();
    int m=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    for(int i=0;i<m;i++)
    {
      int x=in.nextInt();
      int y=in.nextInt();
      if(arr[x-1]>arr[y-1])
         {
           if(a.size()==0)
             a.add(x);
           else if(!a.contains(x))
             a.add(x);
         }
          if(arr[x-1]<arr[y-1])
         {
           if(a.size()==0)
             a.add(y);
           else if(!a.contains(y))
             a.add(y);
         }
         
    }
             System.out.print(a.size());
             }
      }