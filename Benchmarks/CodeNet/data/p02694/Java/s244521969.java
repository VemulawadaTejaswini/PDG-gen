import java.util.*;
public class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    long x = sc.nextLong();

    double money = 100;
    long count = 0;
    while (money < x) {
      count++;
      money = Math.floor(money * 1.01);
    }

    System.out.println(count);

    sc.close();

  }
}