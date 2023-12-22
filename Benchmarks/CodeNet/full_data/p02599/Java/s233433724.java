import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
  	int n=sc.nextInt();
    int q=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
         a[i]=sc.nextInt();
    while(q-->0)
    {
      int l=sc.nextInt();
      int r=sc.nextInt();
       Sol(a,l,r);
    }
}
  public static void Sol(int a[],int l,int r)
  {
      Set<Integer> se=new HashSet<Integer>();
      for(int j=l-1;j<=r-1;j++)
           se.add(a[j]);
       System.out.println(se.size());
      se.clear();
  }
}