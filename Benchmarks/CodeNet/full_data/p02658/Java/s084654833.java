import java.util.*;

public class Main{
public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int[] a=new int[n];
  long ans=1;
  for(int i=0;i<n;i++)
  {  a[i]=sc.nextInt();
   ans *=a[i];}
  
  if(ans>1000000000000000000)
    System.out.println("-1");
  else
    System.out.println(ans);
  
  
  
}
}