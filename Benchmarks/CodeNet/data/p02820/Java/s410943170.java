import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int r = scanner.nextInt();
    int s = scanner.nextInt();
    int p = scanner.nextInt();
    String t = scanner.next();
    char[] ts = t.toCharArray();
    int[] dp = new int[n / k + 1];
    int point = 0;
    char prev = '-';

    for (int i = 0; i < k; i++) {
      for (int j = 0; i + j * k < ts.length; j++) {
        if (ts[i + j * k] == 'r') {
          if (prev != 'p') {
            point += p;
            prev = 'p';
          } else if (i + j * k + k < ts.length) {
            if (ts[i + j * k + k] == 'r') {
              prev = 'r';
            } else if (ts[i + j * k + k] == 's') {
              prev = 's';
            } else {
              prev = 'r';
            }
          }
        } else if (ts[i + j * k] == 'p') {
          if (prev != 's') {
            point += s;
            prev = 's';
          } else if (i + j * k + k < ts.length) {
            if (ts[i + j * k + k] == 'r') {
              prev = 'r';
            } else if (ts[i + j * k + k] == 's') {
              prev = 'p';
            } else {
              prev = 'r';
            }
          }
        } else {
          if (prev != 'r') {
            point += r;
            prev = 'r';
          } else if (i + j * k + k < ts.length) {
            if (ts[i + j * k + k] == 'r') {
              prev = 's';
            } else if (ts[i + j * k + k] == 's') {
              prev = 'p';
            } else {
              prev = 'p';
            }
          }
        }
      }
    }
    System.out.println(point);
  }
}
