import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

  static long n, m, k, ans;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Long.parseLong(in[0]);
    m = Long.parseLong(in[1]);
    k = Long.parseLong(in[2]);

    br.close();

    CombMod cm = new CombMod(300_010);
    MyMod mm = new MyMod(0L);

    for (int i = 0; i <= k; i++) {
      mm.add(
          MyMod.mul(MyMod.mul(m, cm.combMOD((int) n - 1, (int) i)), MyMod.pow(m - 1, n - 1 - i)));
    }

    out.println(mm.val);

    out.flush();
  }
}

class MyMod {

  static final long MOD = 998244353L;
  public long val;

  MyMod(long val) {
    this.val = val;
  }

  MyMod() {
    this(0L);
  }

  public static long add(long a, long b) {
    return (a % MOD + b % MOD) % MOD;
  }

  public static long sub(long a, long b) {
    return ((a % MOD - b % MOD) + MOD) % MOD;
  }

  public static long mul(long a, long b) {
    return (a % MOD * b % MOD) % MOD;
  }

  public static long div(long a, long b) {
    return (a % MOD * pow(b, MOD - 2) % MOD) % MOD;
  }

  // calc a^b
  // b <= 0 は1を返す
  public static long pow(long a, long b) {
    long result = 1L;
    a %= MOD;
    while (b > 0) {
      if (b % 2 == 1) result = (result * a) % MOD;
      a = (a * a) % MOD;
      b = (b >> 1);
    }
    return result;
  }

  // calc inverse element
  public static long invEle(long a) {
    return pow(a % MOD, MOD - 2) % MOD;
  }

  public void add(long a) {
    val = add(val, a);
  }

  public void sub(long a) {
    val = sub(val, a);
  }

  public void mul(long a) {
    val = mul(val, a);
  }

  public void div(long a) {
    val = div(val, a);
  }
}

/*
MODの値と計算はMyModクラスに依存
 */
class CombMod {

  // デフォルトのMAX値
  static final int MAX = 200_010;

  List<Long> fac;
  List<Long> finv;

  CombMod() {
    combIni(MAX);
  }

  CombMod(int m) {
    fac = new ArrayList<>();
    finv = new ArrayList<>();
    combIni(m);
  }

  void combIni(int max) {
    fac.add(1L);
    fac.add(1L);
    finv.add(1L);
    finv.add(1L);
    for (int i = 2; i <= max; i++) {
      fac.add(MyMod.mul(fac.get(i - 1), i));
      finv.add(MyMod.div(finv.get(i - 1), i));
    }
  }

  long combMOD(int n, int r) {
    if (n < r) return 0L;
    if (n < 0 || r < 0) return 0L;
    if (r == 0) return 1L;
    return MyMod.mul(fac.get(n), MyMod.mul(finv.get(r), finv.get(n - r)));
  }
}
