import java.util.*;

public class Main{
	public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
     	ArrayList<Integer> a=new ArrayList<>();
      ArrayList<Integer> b=new ArrayList<>();
      	int n=sc.nextInt();
      	int m=sc.nextInt();
      	int k=sc.nextInt();
      
      	for(int i=0;i<n;i++)
          a.add(sc.nextInt());
      
      	for(int i=0;i<m;i++)
          b.add(sc.nextInt());
      int count=0;
      	while(!a.isEmpty() && !b.isEmpty() && Math.max(a.get(0),b.get(0))<=k )
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