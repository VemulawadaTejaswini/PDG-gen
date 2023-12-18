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
    for(int day = 22 ; day <= d ; day++) {
      int d1 = day % 10;
      int d10 = day / 10;
      if (d1 >= 2 && d10 >= 2 && (d1 * d10) <= m) {
        sekinohi++;
      }
    }
    return sekinohi;
  }
}