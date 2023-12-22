import  java.util.*;
class main
{
  public static void main(String[] args)
{  Scanner sc=new Scanner(System.in);
  //int s,w;
  
  int s=sc.nextInt();
  int w=sc.nextInt();
  if(w>=s)
    System.out.println("unsafe");
  else
    System.out.println("safe");
}
}