import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    int l = s.length();
    int cnt = 0;

    for (int j = 4; j < l; j++) {
      for (int i = 0; i <= j - 4; i++) {
        String bubunmojiretu = s.substring(i, j + 1);
        if (bubunmojiretu.length() <= 18 && Long.parseLong(bubunmojiretu) % 2019 == 0) {
            cnt++;
            continue;
        }

        if (_check(s, 0) == 0) {
          cnt++;
        }
      }
    }

    System.out.println(cnt);

  }

  public static int _check(String s, int tmp) {
    if (s.length() == 1) {
      return tmp * 10 + Integer.parseInt(s) % 2019;
    }

    int wararerukazu = Integer.parseInt(s.substring(0, 1));
    s = s.substring(1);
    tmp = (tmp * 10 + wararerukazu) % 2019;
    return _check(s, tmp);

  }
}
