import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

class Main {
  int N, count;
  char[] s;
  public static void main(String[] args) {
    Main m = new Main();
    m.input();
    m.solve();
    m.out();
  }

  public void input() {
    Scanner sc = new Scanner(System.in);
    s = sc.nextLine().toCharArray();
    sc.close();
  }

  public void solve() {
    N = s.length;
    count = 0;
    while (String.valueOf(s).contains("BW")) {
      for (int i = 0; i < N-1; i++) {
        if (s[i] == 'B' && s[i+1] == 'W') {
          swap(i, i+1);
          break;
        }
      }
    }
  }

  public void out() {
    System.out.println(count);
  }

  void swap(int i, int j) {
    char tmp = s[i];
    s[i] = s[j];
    s[j] = tmp;
    count++;
  }
}
