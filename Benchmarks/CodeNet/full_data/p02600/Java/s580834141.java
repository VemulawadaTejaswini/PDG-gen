import java.util.Scanner;
class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a=0,b=0,c=0;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    int k=sc.nextInt();
    if(a>b&&b>c)
      System.out.print("Yes");
    else
      System.out.print("No");
  }
}