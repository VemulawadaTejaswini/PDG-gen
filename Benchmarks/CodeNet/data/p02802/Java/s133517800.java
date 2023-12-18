import java.util.Scanner;
class Main
{
  public static void main(String[] agh)
  {
    Scanner sc=new Scanner(System.in);
    int n,m;
    n=sc.nextInt();
    m=sc.nextInt();
    int cor=0,inc=0;
    int[] x=new int[n+1];
   // for(int i=0;i<n;i++)
     // System.out.println(x[i]);
    for(int i=0;i<m;i++)
    {
      int que=sc.nextInt();
      String sta=sc.nextLine();
      if(x[que]==0 && sta.equals(" AC"))
      {
        x[que]=1;
        cor++;
      }
      else 
      {
        if(x[que]==0 && sta.equals( " WA"))
        {
          inc++;
        }
      }
    }
      System.out.println(cor+" "+inc);
    
  }
}