import java.util.*;
class atcoder2
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextInt();
    String s="";
    while(n!=0)
    {
      long p=n%26 + 96;
      String str =new Character((char)p).toString();
      s=str+s;
      n=n/26;
    }
    System.out.println(s);
  }
}