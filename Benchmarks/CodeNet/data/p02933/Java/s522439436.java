import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])throws Exception
  {
    Scanner Sc=new Scanner(System.in);
    int a=Sc.nextInt();
    String s=Sc.nextLine();
    if(a<3200)
      System.out.println(s);
    else
      System.out.println("red");
  }
}