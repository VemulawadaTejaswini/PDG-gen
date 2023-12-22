import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
 public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(),x=sc.nextInt(),t=sc.nextInt();
    int a;
    if(n%x==0) a=n/x;
    else a=n/x+1;
    System.out.println(a*t);
  }
}
