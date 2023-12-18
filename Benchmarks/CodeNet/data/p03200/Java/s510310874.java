import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

class Main {
  int N, ans;
  char[] s;
  List<Integer> countList;
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
    countList = new ArrayList<Integer>();
    int count = 0;
    ans = 0;
    for (int i = 0; i < N-1; i++) {
      if (s[i] == 'W' && s[i+1] == 'W' || i == N-2) {
        if (s[i] == 'B' && s[i] == 'W') {
          count++;
        }
        countList.add(count);
        count = 0;
      } else if (s[i] == 'B' && s[i+1] == 'W') {
        count++;
      }
    }
    for (int c : countList) {
      ans += c*2;
    }
  }

  public void out() {
    System.out.println(ans);
  }
}
