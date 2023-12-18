import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner Sc=new Scanner(System.in);
    int r=Sc.nextInt();
    int c=Sc.nextInt();
    int r1=Sc.nextInt();
    int c1=Sc.nextInt();
    int a=r-r1;
    int b=c-c1;
    
    System.out.println(a*b);
  }
}