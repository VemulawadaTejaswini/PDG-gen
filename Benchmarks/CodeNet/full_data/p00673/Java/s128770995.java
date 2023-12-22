/*
 * Main.java: 1088: School Excursion
 */

import java.util.*;

public class Main {
  // constant

  // inner classes

  static class Train {
    int x, y, c;

    Train(int xi, int yi, int ci) {
      x = xi; y = yi; c = ci;
    }
  }

  static class Arrival implements Comparable<Arrival> {
    int y, c;

    Arrival(int yi, int ci) {
      y = yi; c = ci;
    }

    public int compareTo(Arrival a) {
      return c - a.c;
    }
  }

  // main
  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    for (;;) {
      int n = sc.nextInt();
      if (n == 0) break;

      ArrayList<ArrayList<Train>> tbls = new ArrayList<ArrayList<Train>>();

      for (int i = 1; i < n; i++) {
	int mi = sc.nextInt();
	ArrayList<Train> tbli = new ArrayList<Train>();

	for (int j = 0; j < mi; j++) {
	  int xij = sc.nextInt();
	  int yij = sc.nextInt();
	  int cij = sc.nextInt();
	  tbli.add(new Train(xij, yij, cij));
	}

	tbls.add(tbli);
      }

      int g = sc.nextInt();

      ArrayList<Arrival> sts = new ArrayList<Arrival>();
      sts.add(new Arrival(0, 0));

      HashMap<Integer, Arrival> to = new HashMap<Integer, Arrival>();

      for (int i = 0; i < n - 1; i++) {
	ArrayList<Train> tbli = tbls.get(i);
	to.clear();

	for (Arrival st: sts) {
	  int ti = st.y;
	  int ci = st.c;

	  for (Train tbl: tbli) {
	    int xij = tbl.x;
	    int yij = tbl.y;
	    int cij = tbl.c;

	    if (xij >= ti) {
	      int ci0 = ci + cij;
	      if (! to.containsKey(yij))
		to.put(yij, new Arrival(yij, ci0));
	      else if (to.get(yij).c > ci0)
		to.get(yij).c = ci0;
	    }
	  }
	}

	sts.clear();
	for (Arrival st: to.values())
	  sts.add(st);

      }

      Arrival[] gls = new Arrival[sts.size()];
      sts.toArray(gls);
      Arrays.sort(gls);

      int glen = (gls.length < g) ? gls.length : g;
      int csum = 0;

      for (int i = 0; i < glen; i++)
	csum += gls[i].c;

      System.out.printf("%d %d\n", glen, csum);
    }
  }
}