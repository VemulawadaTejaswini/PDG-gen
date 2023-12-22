import java.util.*;

public class Main {
  // inner classes

  static class Chr implements Comparable<Chr> {
    String name;
    int x;

    Chr(String name, int x) {
      this.name = name;
      this.x = x;
    }

    public int compareTo(Chr c) {
      int cmp = c.x - this.x;
      if (cmp != 0) return cmp;
      return this.name.compareTo(c.name);
    }
  }

  // global variables

  static Chr[] chrs, favs, nofavs;
  static int n, m, k, l;

  // subroutines

  static boolean check_rank(int j) {
    Chr tnfv = nofavs[k - j];
    int sum = 0;

    for (int i = 0; i < j; i++) {
      Chr fv = favs[i];
      int diff = tnfv.x - fv.x;
      if (fv.name.compareTo(tnfv.name) > 0) diff++;
      if (diff > 0) sum += diff;
    }

    return (sum <= l);
  }

  // main

  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    for (;;) {
      n = sc.nextInt();
      m = sc.nextInt();
      k = sc.nextInt();
      l = sc.nextInt();
      if ((n | m | k | l) == 0) break;

      chrs = new Chr[n];

      for (int i = 0; i < n; i++) {
	String namei = sc.next();
	int xi = sc.nextInt();
	chrs[i] = new Chr(namei, xi);
      }
      Arrays.sort(chrs);

      HashMap<String,Boolean> fcache = new HashMap<String,Boolean>();

      for (int i = 0; i < m; i++) {
	String namei = sc.next();
	fcache.put(namei, true);
      }

      favs = new Chr[n];
      nofavs = new Chr[n];
      int nfavs = 0, nnofavs = 0;

      for (int i = 0; i < n; i++) {
	if (fcache.containsKey(chrs[i].name))
	  favs[nfavs++] = chrs[i];
	else
	  nofavs[nnofavs++] = chrs[i];
      }

      int lb = 0;
      int ub = ((m < k) ? m : k) + 1;

      while (lb + 1 < ub) {
	int mb = (lb + ub) / 2;
	if (check_rank(mb))
	  lb = mb;
	else
	  ub = mb;
      }

      System.out.println(lb);
    }
  }
}