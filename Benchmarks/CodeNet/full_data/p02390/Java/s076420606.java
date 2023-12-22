import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int second = Integer.valueOf(input.next());
      int minute = secondToMinute(second);
      int hour = secondToHour(second);
      second = second % 60;
      System.out.println(hour + ":" + minute + ":" + second);
  }

  private static int secondToHour(int second) {
    return second / 3600;
  }

  private static int secondToMinute(int second) {
    return (second % 3600) / 60;
  }
}
