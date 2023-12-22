import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();

      int b;

      int c;

      int d;

          b = a % 60;

          c = a % 3600 / 60;

          d = a /3600;

 
       System.out.println(d+":"+c+":"+b);
  }
}
     
