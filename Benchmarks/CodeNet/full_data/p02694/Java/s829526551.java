import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();

    long yoki = 100;
    for (int i = 1; i < 4000; i++){
      yoki = (long)Math.floor(yoki * 1.01);
      if (yoki >= x) {
        System.out.println(i);
        return;
      }
    }
  }
}
