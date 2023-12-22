import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
      ArrayList<Integer> a1=new ArrayList<Integer>();
      HashMap<Integer,Integer>  map=new HashMap<Integer,Integer>();
	int[] a=new int[n];
	int s=0;
       for(int i=0;i<n;i++)
      {
	a[i]=sc.nextInt();
	s=s+a[i];
               if(map.containsKey(a[i]))
	map.put(a[i],map.get(a[i])+1);
              else
  	map.put(a[i],1);
      }
       int q=sc.nextInt();
    int sum=s;
      for(int i=0;i<q;i++)
      {
	int x1=sc.nextInt();
	int x2=sc.nextInt();
                 if(map.containsKey(x1))
                {
	sum=sum+((x2-x1)*map.get(x1));
	if(map.containsKey(x2))
	          map.put(x2,map.get(x2)+map.get(x1));
                  else
	{
		map.put(x2,map.get(x1));
	}
                map.remove(x1);
	}
              a1.add(sum);
    }     
   for(int t=0;t<a1.size();t++)
	System.out.println(a1.get(t));
  }
}