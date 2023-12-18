import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int r = sc.nextInt();

    int rMin = 2020;

    for (int i = l; i < r; ++i) {
      for (int j = i + 1; j <= r; ++j) {
        int rem = (i * j) % 2019;
        rMin = (rem < rMin) ? rem : rMin;
      }
    }

    System.out.println(rMin);
  }
}