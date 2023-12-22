import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
      ArrayList<Integer> a1=new ArrayList<Integer>();
	int[] a=new int[n];
	
       for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
       int q=sc.nextInt();
      for(int i=0;i<q;i++)
      {
	int x1=sc.nextInt();
	int x2=sc.nextInt();
	int sum=0;
	for(int k=0;k<n;k++)
	{
	         if(x1==a[k])
	        {
		a[k]=x2;
		sum=sum+x2;
	        }
	        else
		sum=sum+a[k];
	}
              a1.add(sum);
    }     
   for(int t=0;t<a1.size();t++)
	System.out.println(a1.get(t));
  }
}