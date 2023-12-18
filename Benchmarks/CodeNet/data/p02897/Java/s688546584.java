import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int remainder = N % 2;
    int quotient = N / 2;

    if (remainder == 0) {
      System.out.println("0.5000000000");
    } else {
      double probability = (quotient + 1.0) / N;
      System.out.println(probability);
    }
  }
}
