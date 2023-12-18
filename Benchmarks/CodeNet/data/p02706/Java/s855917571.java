import java.util.*;
public  class Main
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  String h[]=sc.nextLine().split(" ");
  String hh[]=sc.nextLine().split(" ");
  int s=0;

  int a=Integer.parseInt(h[0]);
  for(int i=0;i<hh.length;i++)
  {s+=Integer.parseInt(hh[i]);
    if(s>a){break;}
  }
  System.out.println(s>a?-1:(a-s));
}}