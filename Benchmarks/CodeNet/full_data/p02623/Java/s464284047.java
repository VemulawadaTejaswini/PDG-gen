import java.util.*;

public class Main{
	public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
     	ArrayList<Long> a=new ArrayList<>();
      ArrayList<Long> b=new ArrayList<>();
      	long n=sc.nextLong();
      	long m=sc.nextLong();
      	long k=sc.nextLong();
      
      	for(long i=0;i<n;i++)
          a.add(sc.nextLong());
      
      	for(long i=0;i<m;i++)
          b.add(sc.nextLong());
      long count=0;
      	while(!a.isEmpty() && !b.isEmpty() && (long)Math.max(a.get(0),b.get(0))<=k )
        {
         	if(a.get(0)<=b.get(0) && a.get(0)<=k )
            {k=k-a.get(0);
             a.remove(0);
             count++;}
          
          else	if(a.get(0)>b.get(0) && b.get(0)<=k )
            {k=k-b.get(0);
             b.remove(0);
             count++;}
          
        }
      
      while(!b.isEmpty() && b.get(0)<=k)
      {k=k-b.get(0);
             b.remove(0);
             count++;
      }
      
        while(!a.isEmpty() && a.get(0)<=k)
      {k=k-a.get(0);
             a.remove(0);
             count++;
      }
      
      System.out.println(count);
    }
}