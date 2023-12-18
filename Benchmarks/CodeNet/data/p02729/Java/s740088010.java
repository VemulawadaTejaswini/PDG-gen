import java.util.*;
class Main
{
  static long fact(int n)
  {
    long f=1;
    for(;n>0;n--)
      f*=n;
    return(f);
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();
    long a=(fact(M)/(fact(M-2)*2));
    long b=(fact(N)/(fact(N-2)*2));
    System.out.println(a+b);
  }
}