import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int t = sc.nextInt();

    int count = 0;
    int time = 0;

    while (n > count) {
      time += t;
      count += x;
    }

    System.out.println(time);
  }
}