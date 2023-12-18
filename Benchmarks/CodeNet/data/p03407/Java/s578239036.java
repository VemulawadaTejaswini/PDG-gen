import java.util.Scanner;

public class Main{
  public static void main (String[] args){
  
    int a,b,c;
    int sum;

    Scanner sc = new Scanner (System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();

    sum=a+b;

    if(sum>=c)
      System.out.println("Yes");
   else if(sum<=c)
      System.out.println("No"); 

  }

}