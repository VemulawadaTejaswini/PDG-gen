import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();

      double f = 1.0 * a / b  ;

    System.out.println(a / b+" "+a % b+" "+String.format("%.8f",f));
  }
}
