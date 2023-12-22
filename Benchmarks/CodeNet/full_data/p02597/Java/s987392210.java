import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char[] c = sc.next().toCharArray();
    int rCount = 0;
    int wCount = 0;
    for (int i = 0; i < n; i++) {
      if (c[i] == 'W') {
        wCount++;
      } else {
        rCount++;
      }
    }
    int left = 0;
    int right = n - 1;
    int count = 0;
    while (true) {
      if (c[left] == 'W') {
        while (true) {
          if (c[right] != 'R') {
            right--;
            if (left >= right) {
              break;
            }
          } else {
            count++;
            right--;
            break;
          }
        }
      }
      left++;
      if (left >= right) {
        break;
      }
    }
    System.out.println(Math.min(Math.min(wCount, rCount), count));
  }
}
