import java.util.*;

public class Main {
  // constant

  static final int SUM_W = 10;

  // inner classes

  // global variables

  static int[] manju;

  // subroutines

  static ArrayList<int[]> pack_manju(int k, int w, int[] mj) {
    if (k >= 9) {
      ArrayList<int[]> list = new ArrayList<int[]>();
      if (w == 0) {
        list.add(mj.clone());
        return list;
      }
      return list;
    }

    ArrayList<int[]> mjs = new ArrayList<int[]>();
    int mjk = manju[k];

    for (int i = 0; i <= mjk; i++) {
      int w0 = w - (k + 1) * i;
      if (w0 >= 0) {
        mj[k] = i;
        ArrayList<int[]> mjs0 = pack_manju(k + 1, w0, mj);
        mjs.addAll(mjs0);
      }
    }

    return mjs;
  }

  static int max_count_pack(int k, int[] mj, ArrayList<int[]> mjs) {
    if (k >= mjs.size()) return 1;

    int mc0 = max_count_pack(k + 1, mj, mjs);

    int[] mj0 = new int[9];

    for (int i = 0; i < 9; i++) {
      mj0[i] = mj[i] + mjs.get(k)[i];
      if (mj0[i] > manju[i]) return mc0;
    }

    int mc1 = 1 + max_count_pack(k + 1, mj0, mjs);

    return (mc0 > mc1) ? mc0 : mc1;
  }

  // main

  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    manju = new int[9];

    for (;;) {
      int n = sc.nextInt();
      if (n == 0) break;

      for (int i = 0; i < 9; i++) manju[i] = 0;

      for (int i = 0; i < n; i++) {
        String nstr = sc.next();
        manju[Integer.parseInt(nstr) - 1]++;
      }

      int mc = 0;

      for (int i = 0; i < 4; i++) {
        int m = (manju[i] < manju[8 - i]) ? manju[i] : manju[8 - i];
        manju[i] -= m;
        manju[8 - i] -= m;
        mc += m;
      }

      int m = manju[4] / 2;
      manju[4] -= 2 * m;
      mc += m;

      ArrayList<int[]> mjs = pack_manju(0, SUM_W, new int[9]);

      int[] mj = new int[9];
      Arrays.fill(mj, 0);

      mc += max_count_pack(0, mj, mjs) - 1;
      System.out.println(mc);
    }
  }
}