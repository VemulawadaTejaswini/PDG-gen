
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = Long.parseLong(sc.next().replace(".",""));
    sc.close();

    long x = a * b / 100;

    System.out.println(x);
  }

}
