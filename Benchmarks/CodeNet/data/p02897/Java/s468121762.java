import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    sc.close();
    int even = n / 2;
    double p = (double) (n - even) / n;
    System.out.println(p);
  }
}