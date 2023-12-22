import java.util.Scanner;
class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Long a  = sc.nextLong();
    double b  = sc.nextDouble();

    System.out.println((long)Math.floor(a*b));

  }
}