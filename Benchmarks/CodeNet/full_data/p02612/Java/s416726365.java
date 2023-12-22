import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner();
    int N = sc.nextInt();
    if (N % 1000 == 0) {
      System.out.println(0);
    } else {
      System.out.println(((Math.ceil(N / 1000)) * 1000) - N);
    }

  }
}