import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int a = Integer.valueOf(input.next());
      int b = Integer.valueOf(input.next());
      int c = Integer.valueOf(input.next());

      if (a < b && b < c) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      } 
  }

  private static int secondToHour(int second) {
    return second / 3600;
  }

  private static int secondToMinute(int second) {
    return (second % 3600) / 60;
  }
}
