import java.util.*;

// 足し算の数式を保持するクラス
// usage
// AddForm f = new AddForm();
// f.append(1,1);
// f.append(2,0);
// f.append(3,0);
// f.append(4,1);
// f.append(5,0); // 123 + 45
// int ans = f.eval(); // 168
//
class AddFormula {
  long[] a = new long[11]; // 式の数字列、123 + 45 なら [123,45,0,0,0..]
  int n = 0; // 式の数字の数、123 + 45 なら 5
  int m = 0; // 値が0である最初の位置、123 + 45 なら 2

  // 式に数字を追加する
  // flag: 0 -> 式の最後の数字の1の位に追加
  // flag: 1 -> 式の最後に足し算で追加
  public void append(long x, int flag) {
    if (flag == 0) {
      a[m - 1] = a[m - 1] * 10L + x;
    } else {
      a[m] = x;
      m++;
    }
    n++;
  }

  // 式の値を計算
  public long eval() {
    long ans = 0;
    for (int i = 0; i < m; i++) {
      ans += a[i];
    }
    return ans;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      String s = scanner.next();
      int n = s.length();
      int m = 1 << n-1;
      long ans = 0;

      for (int bit = 0; bit < m; bit++) {
        AddFormula f = new AddFormula();
        f.append(s.charAt(0) - '0', 1);
        for (int i = 1; i < n; i++) {
          int flag = (bit >> (i - 1)) & 1;
          long x = s.charAt(i) - '0';
          f.append(x,flag);
        }
        ans += f.eval();
      }
      System.out.println(ans);
    } finally {
      scanner.close();
    }
  }
}
