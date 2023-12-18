import java.util.Scanner;
public class Main{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    boolean flag=true;
    String str=sc.next();
    for(int i=0;i<str.length();i++)
    {
      char ch=str.charAt(i);
      int count = 0;
      for(int j=0;j<str.length();j++)
      {
        if(ch==str.charAt(j))
        {
          count++;
        }
      }
      if(count%2!=0)
        flag=false;
    }
    if(flag)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}