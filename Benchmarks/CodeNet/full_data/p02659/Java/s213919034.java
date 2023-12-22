import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = Long.parseLong(sc.next().replace(".",""));
    System.out.println(a * b / 100);
  }
}
