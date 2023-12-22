import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c, k;
    boolean result = false;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    k = sc.nextInt();

    if (c >= b && b > a) {
      result = true;
    }

    else if (b > c && c >= a || b >= a && a > c) {
      if (a == b) {
        b = 2 * b;
        k -= 1;
      }
      c = c * (int) Math.pow(2, k);
      if (c > b && b > a) {
        result = true;
      } else {
        result = false;
      }
    }

    else if (c > b && b == a || c >= a && a > b) {
      if (c == a) {
        c = 2 * c;
        k -= 1;
      }

      for (int cntK = 1; cntK <= k; cntK++) {
        b = b * (int) Math.pow(2, cntK);
        if (c > b && b > a) {
          result = true;
          break;
        } else {
          result = false;
        }
      }

    } else if (a > c && c >= b || a > b && b > c) {
      for (int cntK = 1; cntK <= k; cntK++) {

        b = b * (int) Math.pow(2, cntK);
        if (b > a) {
          if (c * (int) Math.pow(2, k - cntK) > b) {
            result = true;
            break;
          }
        } else {
          result = false;
        }
      }
    }

    // print result
    if (result) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    sc.close();
  }

}