import java.util.*;
public class Main{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] sea=new int[n+1];
    int[] bugs=new int[n+1];
    int[] hw=new int[n+1];
    for(int i=0;i<n;i++)
    {
     sea[i]=sc.nextInt();
      bugs[i]=sc.nextInt();
      hw[i]=sc.nextInt();
    }
    int [][]happiness=new int[n+1][3];
    for(int i=1;i<=n;i++)
    {
      happiness[i][0]=sea[i]+Math.max(bugs[i-1],hw[i-1]);
      happiness[i][1]=bugs[i]+Math.max(sea[i-1],hw[i-1]);
      happiness[i][2]=hw[i]+Math.max(bugs[i-1],sea[i-1]);
    }
    int max=happiness[n][0];
    for(int i=1;i<3;i++)
    {
      if(happiness[n][i]>max)
         max=happiness[n][i];
    }
    System.out.println(max);
  }
}