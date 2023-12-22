
import java.io.*;
import java.util.*;

class Main {
  static final int MAX_N = 15;
  static final int MAX_BITS = (1 << MAX_N) - 1;

  static class RetBox {
    double time;
    ArrayList<Integer> ids;

    RetBox(double time, ArrayList<Integer> ids) {
      this.time = time;
      this.ids = ids;
    }
  }

  static class Storage {
    int id, dist, w;

    Storage(int id, int dist, int w) {
      this.id = id;
      this.dist = dist;
      this.w = w;
    }
  }

  static int[][] edges;
  static RetBox[][] pathhash;

  static String intJoin(int[] ns, String delim) {
    String out = "" + ns[0];
    for (int i = 1; i < ns.length; i++)
      out += delim + ns[i];
    return out;
  }

  static String intJoin(ArrayList<Integer> nlist, String delim) {
    String out = "" + nlist.get(0);
    for (int i = 1; i < nlist.size(); i++)
      out += delim + nlist.get(i);
    return out;
  }

  static RetBox check_path(int src, int bits, Storage[] strs, int w) {
    if (pathhash[src][bits] != null) return pathhash[src][bits];

    int n = strs.length;
    Storage stsrc = strs[src];

    int bits0 = (bits | (1 << src));
    int w0 = w + stsrc.w;

    double min_time = Double.POSITIVE_INFINITY;
    ArrayList<Integer> min_ids = null;

    for (int nxt = 0; nxt < n; nxt++) {
      if (((bits0 >> nxt) & 1) != 0) continue;

      RetBox nret = check_path(nxt, bits0, strs, w0);
      double time = nret.time + (double)edges[src][nxt] * (70 + w0) / 2000;

      if (min_time > time) {
        min_time = time;
        min_ids = new ArrayList<Integer>(nret.ids);
        min_ids.add(0, new Integer(stsrc.id));
      }
    }

    return (pathhash[src][bits] = new RetBox(min_time, min_ids));
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine().trim());

    Storage[] strs = new Storage[n];

    for (int i = 0; i < n; i++) {
      String[] nums = br.readLine().trim().split(" ");
      strs[i] =
        new Storage(Integer.parseInt(nums[0]),
                    Integer.parseInt(nums[1]),
                    Integer.parseInt(nums[2]) * 20);
    }

    edges = new int[n][n];

    for (int i = 0; i < n; i++)
      for (int j = i + 1; j < n; j++)
        edges[i][j] = edges[j][i] =
          Math.abs(strs[i].dist - strs[j].dist);

    pathhash = new RetBox[n][MAX_BITS];
    int nbits = (1 << n) - 1;

    for (int i = 0; i < n; i++) {
      ArrayList<Integer> ids0 = new ArrayList<Integer>(1);
      ids0.add(new Integer(strs[i].id));
      pathhash[i][nbits ^ (1 << i)] = new RetBox(i, ids0);
    }

    double min_time = Double.POSITIVE_INFINITY;
    ArrayList<Integer> min_ids = null;

    for (int src = 0; src < n; src++) {
      RetBox ret = check_path(src, 0, strs, 0);

      if (min_time > ret.time) {
        min_time = ret.time;
        min_ids = ret.ids;
      }
    }

    System.out.println(intJoin(min_ids, " "));
  }
}