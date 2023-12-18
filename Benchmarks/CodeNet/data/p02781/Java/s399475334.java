
import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final String n = scanner.next();
    final int k = scanner.nextInt();
    final List<Integer> ns = new ArrayList<>();
    for (int i = 0; i < n.length(); i++) {
      ns.add(Character.getNumericValue(n.toCharArray()[i]));
    }
    final int len = n.length();
    int sum = 0;

    if (len > k) {
      sum += calcCombination(len - 1, k) * pow(9, k);
    }
    sum += (ns.get(0) - 1) * calcCombination(len - 1, k - 1) * pow(9, k - 1);

    if (k == 2) {
      int i;
      for (i = 1; i < ns.size(); i++) {
        if (ns.get(i) != 0) {
          i += 1;
          break;
        }
      }
      sum += ns.get(i-1) + 9 * (ns.size() - i);
    } else if (k==3) {
      int i;
      for (i = 1; i < ns.size(); i++) {
        if (ns.get(i) != 0) {
          i += 1;
          break;
        }
      }
      sum += (ns.get(i-1)-1)  * calcCombination(len - 1, 1) * pow(9, 1);
      for (; i < ns.size(); i++) {
        if (ns.get(i) != 0) {
          i += 1;
          break;
        }
      }
      sum += ns.get(i-1) + 9 * (ns.size() - i);
    }

    System.out.println(sum);

  }

  private static int calcCombination(int n, int r) {
    int num = 1;
    for (int i = 1; i <= r; i++) {
      num = num * (n - i + 1) / i;
    }
    return num;
  }
}
