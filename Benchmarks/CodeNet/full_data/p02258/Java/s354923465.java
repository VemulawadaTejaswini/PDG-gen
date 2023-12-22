import java.util.Scanner;
class Main
{
  public static void main(String[]av)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] R=new int[n];
    for(int i=0;i<n;i++)
    {
      R[i]=sc.nextInt();
    }
    int minv=R[0],maxv=(1000000000)*(-1);
    for(int j=1;j<n;j++)
    {
      if(maxv<R[j]-minv)
      {
        maxv=R[j]-minv;
      }
      if(minv>R[j])
      {
        minv=R[j];
      }
    }
    System.out.println(maxv);
  }
}

