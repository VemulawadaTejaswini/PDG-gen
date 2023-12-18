java.util.Scanner;

class asheep{
 public static void main(String[] args) {
    Scanner stdIn = new Scanner (System.in);

    int a = stdIn.nextInt();
    int b = stdIn.nextInt();

    if (a > b ) {
      System.out.println("safe");
    }else {
      System.out.println("unsafe");
    }
  }
}