import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long money = 100;
    int count = 0;
    while (x > money) {
      money = (long) ((long) money * 1.01);
      count++;
    }
    System.out.println(count);
  }

}
