import java.io.*;
import java.util.*;
class First
{
  public static void main(String args[])
  {
    Scanner Sc=new Scanner(System.in);
    int r=Sc.nextInt();
    int c=Sc.nextInt();
    int r1=Sc.nextInt();
    int c1=Sc.nextInt();
    System.out.println((r-r1)*(c-c1));
  }
}