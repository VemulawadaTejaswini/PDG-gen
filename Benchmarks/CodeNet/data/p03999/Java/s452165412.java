import java.util.*;
 
class AddFormula {
  long[] a = new long[11]; //＋を含めて最大11要素として考える
  int n = 0; 
  int m = 0;
  
  public void append(long x, int flag) {
    if (flag == 0) {
      a[m - 1] = a[m - 1] * 10L + x;
    } else {
      a[m] = x;
      m++;
    }
    n++;
  }
  
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
      //System.out.println(ans);
    } finally {
      scanner.close();
    }
  }
}//こっちの解答も全然理解できていない泣