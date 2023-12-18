

import java.util.*;
public class Solution
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  int t=sc.nextInt();
    int a=t/500;
    int b=((t-500*a)/5)*5;
  System.out.println(1000*a+b);
  }
}