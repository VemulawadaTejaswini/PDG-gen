import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int d = sc.nextInt();
    Main takahashiCalendar = new Main();
    System.out.println(takahashiCalendar.calc(m, d));
  }
  
  public int calc(int m, int d) {
    int sekinohi = 0;
    for(int month = 4 ; month <= m ; month++) {
      for(int day = 22 ; day <= d ; day++) {
        int d1 = day % 10;
        int d10 = day / 10;
        if (month == (d1 * d10)) {
          sekinohi++;
        }
      }
    }
    return sekinohi;
  }
}