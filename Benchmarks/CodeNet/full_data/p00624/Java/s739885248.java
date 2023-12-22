import java.util.*;

public class Main {
  // constant

  static int MAX_INT = Integer.MAX_VALUE;

  // global variables

  static HashMap<Integer, Integer> dists;

  // inner classes

  static class Stat {
    final int id;
    final int[] cids;
    final boolean[] ps;
    final int hc;

    Stat(int id, int[] cids, boolean[] ps) {
      this.id = id;
      this.cids = cids.clone();
      this.ps = ps.clone();
      this.hc =
	(id << 24) |
	(cids[0] << 17) | (cids[1] << 10) | (cids[2] << 3) |
	(ps[0] ? 4 : 0) | (ps[1] ? 2 : 0) | (ps[2] ? 1 : 0);
    }

    @Override
    public int hashCode() {
      return hc;
    }

    @Override
    public String toString() {
      return
	"[ " + id + " [ " + cids[0] + " " + cids[1] + " " + cids[2] +
	" ] [ " + ps[0] + " " + ps[1] + " " + ps[2] + " ] ] (" +
	hc + ") = " + dists.get(hc);
    }
  }

  static class StatComp implements Comparator<Stat> {
    public int compare(Stat st0, Stat st1) {
      return (dists.get(st0.hc).intValue() - dists.get(st1.hc).intValue());
    }
  }

  // subroutines

  static int findArray(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++)
      if (arr[i] == key) return i;
    return -1;
  }

  static void setDist(Stat sn, PriorityQueue<Stat> q, int d) {
    if (dists.containsKey(sn.hc)) {
      if (dists.get(sn.hc) > d) {
	//System.out.println("(" + sn.hc + ") " + dists.get(sn.hc) + "->" + d);
	dists.put(sn.hc, d);
	q.remove(sn);
	q.add(sn);
      }
    }
    else {
      //System.out.println("(" + sn.hc + ") MAX_INT->" + d);
      dists.put(sn.hc, d);
      q.add(sn);
    }
  }

  // main
  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    for (;;) {
      int h = sc.nextInt();
      int w = sc.nextInt();
      if (h == 0 && w == 0) break;

      String[] lines = new String[h];
      for (int y = 0; y < h; y++)
	lines[y] = sc.next();

      int nc = 0, np = 0;
      int[] cids = {0, 0, 0};
      int[] pids = {0, 0, 0};
      boolean[] ps = {false, false, false};

      int sid = 0, gid = 0;

      int[] grds = new int[h * w];
      Arrays.fill(grds, 0);

      for (int y = 0; y < h; y++)
	for (int x = 0; x < w; x++) {
	  int id = y * w + x;

	  switch (lines[y].charAt(x)) {
	  case '#':
	    grds[id] = -1;
	    break;
	  case '@':
	    sid = id;
	    break;
	  case 'w':
	    pids[np] = id;
	    ps[np] = true;
	    np++;
	    grds[id] = np;
	    break;
	  case 'c':
	    cids[nc] = id;
	    nc++;
	    break;
	  case 'E':
	    gid = id;
	    break;
	  }
	}
      //System.out.printf("sid = %d, gid = %d\n", sid, gid);

      Stat stn = new Stat(sid, cids, ps);

      dists = new HashMap<Integer, Integer>();
      dists.put(stn.hc, 0);

      int min_dist = -1;
      int[] dids = {1, -w, -1, w};

      PriorityQueue<Stat> q = new PriorityQueue<Stat>(100, new StatComp());
      q.add(stn);

      while (! q.isEmpty()) {
	Stat un = q.poll();
	//System.out.println(un);

	int uid = un.id;
	int[] ucids = un.cids;
	boolean[] ups = un.ps;

	if (uid == gid) {
	  min_dist = dists.get(un.hc);
	  break;
	}

	int ud = dists.get(un.hc);

	for (int did: dids) {
	  int vid = uid + did;
	  int gv = grds[vid];
	  if (gv < 0 || (gv > 0 && ups[gv - 1])) continue;

	  int ci = findArray(ucids, vid);
	  // System.out.printf("did=%d, ci=%d\n", did, ci);

	  if (ci >= 0) {
	    int[] vcids = ucids.clone();
	    boolean[] vps = ups.clone();

	    while (grds[vcids[ci] + did] >= 0 && 
		   findArray(vcids, vcids[ci] + did) < 0) {
	      vcids[ci] += did;
	      if (grds[vcids[ci]] > 0) {
		int pi = grds[vcids[ci]] - 1;
		if (vps[pi]) {
		  vps[pi] = false;
		  vcids[ci] = 0;
		  break;
		}
	      }
	    }

	    //System.out.printf("vcids[ci]=%d, ucids[ci]=%d\n",
	    //vcids[ci], ucids[ci]);
	    if (vcids[ci] != ucids[ci]) {
	      Stat vn = new Stat(uid, vcids, vps);
	      setDist(vn, q, ud);
	    }

	    continue;
	  }

	  Stat vn = new Stat(vid, ucids, ups);
	  setDist(vn, q, ud + 1);
	}
      }

      System.out.println(min_dist);
    }
  }
}