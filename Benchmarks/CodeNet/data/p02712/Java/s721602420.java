import java.util.*;


class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int quo = n / 15;
    int rem = n % 15;

    long laps = calcLaps(quo);
    long rems = calcRems(quo, rem);
    System.out.println(laps + rems);
  }

  private static long calcLaps(int quo) {
    long l = quo * 2 - 1;
    long aLap = 60;
    return aLap * l;
  }

  private static long calcRems(int quo, int rem) {
    if (rem == 0) {
      return 0;
    } else {
      long lapBottom = 15 * quo;
      int i = 1;
      int fraction = 0;

      while (i <= rem) {
        if (i % 3 == 0 || i % 5 == 0){
          i++;
        } else {
          fraction += i;
          i++;
        }
      }
      return lapBottom * rem + fraction;
    }
  }
}
