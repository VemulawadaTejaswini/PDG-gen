import java.util.*;
class java
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s,d;
    double k;
    k=sc.nextDouble();
    s=sc.nextLine();
    int p=s.length();
    if(k<p)
    {
      d=s.substring(0,k);
      System.out.println(d+"...");
    }
    else
    {
      System.out.println(s);
    }
  }
}

    