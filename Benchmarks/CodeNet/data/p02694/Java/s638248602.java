
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long money = 100;
    long year = 0;
    while (true) {
      money = (long)(money * 1.01);
      year++;
      if (money >= x) {
        break;
      }
    }
    System.out.println(year);
  }
}
