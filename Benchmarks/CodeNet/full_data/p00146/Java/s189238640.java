
import java.io.*;
import java.util.*;

class Main {
  static class RetBox {
    double time, dist;
    ArrayList<Integer> ids;

    RetBox(double time, double dist, ArrayList<Integer> ids) {
      this.time = time;
      this.dist = dist;
      this.ids = ids;
    }
  }

  static class Storage {
    int i, id;
    double dist;
    int tresn;

    Storage(int i, int id, double dist, int tresn) {
      this.i = i;
      this.id = id;
      this.dist = dist;
      this.tresn = tresn;
    }
  }

  static final double MAX_TIME = 1.0e20;
  static final int MAX_N = 15;

  static double[][] edges;
  static HashMap<String, RetBox> pathhash;

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

  static RetBox check_path(int src, ArrayList<Storage> strs) {
    int n = strs.size();
    if (n == 1) {
      ArrayList<Integer> ids = new ArrayList<Integer>();
      ids.add(strs.get(src).id);
      return new RetBox(0, 0, ids);
    }

    int[] keyids = new int[n];
    for (int i = 0; i < n; i++) keyids[i] = strs.get(i).id;
    String key = "" + src + "-" + intJoin(keyids, ",");
    RetBox hashret = pathhash.get(key);
    if (hashret != null) return hashret;

    Storage stsrc = strs.remove(src);
    n--;

    double min_time = MAX_TIME;
    double min_dist = 0.0;
    ArrayList<Integer> min_ids = null;

    for (int nxt = 0; nxt < n; nxt++) {
      RetBox nret = check_path(nxt, strs);
      double dist = edges[stsrc.i][strs.get(nxt).i] + nret.dist;
      double time = nret.time + dist * (70 + 20 * stsrc.tresn) / 2000;

      if (min_time > time) {
        min_time = time;
        min_dist = dist;
        min_ids = new ArrayList<Integer>(nret.ids);
        min_ids.add(0, new Integer(stsrc.id));
      }
    }

    strs.add(src, stsrc);

    RetBox ret = new RetBox(min_time, min_dist, min_ids);
    pathhash.put(key, ret);
    return ret;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine().trim());

    ArrayList<Storage> strs = new ArrayList<Storage>();

    for (int i = 0; i < n; i++) {
      String[] nums = br.readLine().trim().split(" ");
      Storage sti =
        new Storage(i, Integer.parseInt(nums[0]),
                    Double.parseDouble(nums[1]),
                    Integer.parseInt(nums[2]));
      strs.add(sti);
    }

    edges = new double[MAX_N][MAX_N];

    for (int i = 0; i < n; i++)
      for (int j = i + 1; j < n; j++)
        edges[i][j] = edges[j][i] =
          Math.abs(strs.get(i).dist - strs.get(j).dist);

    pathhash = new HashMap<String, RetBox>();

    double min_time = MAX_TIME;
    ArrayList<Integer> min_ids = null;

    for (int src = 0; src < n; src++) {
      RetBox ret = check_path(src, strs);

      if (min_time > ret.time) {
        min_time = ret.time;
        min_ids = ret.ids;
      }
    }

    System.out.println(intJoin(min_ids, " "));
  }
}