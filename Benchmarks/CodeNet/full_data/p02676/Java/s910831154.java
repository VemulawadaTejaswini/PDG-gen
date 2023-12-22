import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int K=sc.nextInt();
     String s=sc.next();
    if(s.length()<=K)
      System.out.print(s);
    else
      System.out.print(s.substring(0,K)+"...");
    
  }
}