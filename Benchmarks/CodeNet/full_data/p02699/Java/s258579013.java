import java.util.Scanner;

class asheep{
 public static void main(String[] args) {
    Scanner stdIn = new Scanner (System.in);

    System.out.println("How many sheeps?");
    int a = stdIn.nextInt();

    System.out.println("How many wolves");
    int b = stdIn.nextInt();

    if (a >= b ) {
      System.out.println("safe");
    }else {
      System.out.println("unsafe");
    }
  }
}
