import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a,b,c,d;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();
    int sum=0;
    if(a>=d)
      System.out.println(d);
     else
     if(a+b>=d)
         System.out.println(a);
      else
     if((a+b)-(a+b)-d<=0)
        System.out.println(sum);
    
  }
}