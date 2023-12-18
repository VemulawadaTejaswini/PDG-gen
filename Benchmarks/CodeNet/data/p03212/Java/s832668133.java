import java.util.Scanner;

public class Main {

  static int countSaiki = 0;

  public static boolean is753(int n) {
    boolean is3 = false;
    boolean is5 = false;
    boolean is7 = false;
    while (n > 0) {
      if (n % 3 == 0) {
        is3 = true;
      } else if (n % 5 == 0) {
        is5 = true;
      } else if (n % 7 == 0) {
        is7 = true;
      } else {
        return false;
      }
      n /= 10;
    }
    if (is3 && is5 && is7) {
      return true;
    } else {
      return false;
    }
  }

  public static int dec7(int current753) {
    int next753 = current753;
    current753 /= 10;
    switch (current753 % 10) {
    case 3:
    case 5:
      next753 = (int) ((current753 + 2) * Math.pow(10, countSaiki) + 3);
      break;

    case 7:
      countSaiki++;
      dec7(current753);
      break;
    }
    return next753;
  }

  public static int next753(int current753) {
    int next753 = current753;

    switch (current753 % 10) {
    case 3:
      next753 += 2;
      break;
    case 5:
      next753 += 2;
      break;
    case 7:
      next753 = dec7(current753);
      break;
    }

    return next753;
  }

  public static int count753(int upLimit) {
    int counter = 0;
    int cand = 357;
    while (cand <= upLimit) {
      if (is753(cand)) {
        counter++;
        cand = next753(cand);
      }
    }
    return counter;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int upLimit = sc.nextInt();
    System.out.println(count753(upLimit));
  }

}
