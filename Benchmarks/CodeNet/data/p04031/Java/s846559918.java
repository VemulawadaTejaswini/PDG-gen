import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();double sum=0;
    int ar[]=new int[n];
    for(int i=0;i<n;i++)
    {
    ar[i]=sc.nextInt();
    sum+=ar[i];
    }
    double kk=sum/n;
    int gh=(int)Math.round(kk);
    long cost=0;
    for(int i=0;i<n;i++)
    {
        cost+=(ar[i]-gh)*(ar[i]-gh);
    }
    System.out.println(cost);}}
    