import java.util.*;
// import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.solve();
  }

  int n;
  String s;
  BitSet[] L, R;

  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      n = sc.nextInt();
      s = sc.next();
      L = new BitSet[n+1];
      R = new BitSet[n+1];
    } finally {
      sc.close();
    }
  }

  void solve() {
    update();
    int ans = 0;
    for (int i = 0; i < n; i++) {
      BitSet cnt = new BitSet(26);
      cnt.or(L[i]);
      cnt.and(R[i]);
      if (ans < cnt.cardinality()) ans = cnt.cardinality();
    }
    System.out.println(ans);
  }

  void update() {
    fillFromLeft();
    fillFromRight();
  }

  void fillFromLeft() {
    L[0] = charToBit(s.charAt(0));
    for (int i = 0; i < n; i++) {
      L[i+1] = charToBit(s.charAt(i));
      L[i+1].or(L[i]);
    }
  }
  
  void fillFromRight() {
    R[n] = charToBit(s.charAt(n-1));
    for (int i = n - 1; i >= 0; i--) {
      R[i] = charToBit(s.charAt(i));
      R[i].or(R[i+1]);
    }
  }

  BitSet charToBit(char i) {
    BitSet ans = new BitSet(26);
    ans.set(i - 'a');
    return ans;
  }
}
