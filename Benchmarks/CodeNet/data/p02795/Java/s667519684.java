import java.util.*;
public class Main
  {
  public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();
    int A=sc.nextInt();
    if(N>=M)
      {
      i=A/N;
      if((A%N)!=0)
        ++i;
      }
    else
      {
      i=A/M;
      if((A%M)!=0)
        ++i;
      }
    System.out.println(i);
    }
  }
