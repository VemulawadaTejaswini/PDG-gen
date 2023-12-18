import java.util.Scanner;

class Main{
  public static void main(String[] arg){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    int c=scan.nextInt();
    if(a+b+c>=22){
      System.out.println("bust");
    }else{
      System.out.println("win");
    }
  }
}