import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    StringBuilder sb=new StringBuilder();
    while(n>0)
    {
      if(n%26==0)
      {
        sb.append('z');
        n=n/26-1;
      }
      else
      {
        sb.append((char)(n%26+96));
        n/=26;
      }
    }
    System.out.println(sb.reverse());
  }
}