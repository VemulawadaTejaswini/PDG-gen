import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[][] red = new int[n][2];
    int[][] blue = new int[n][2];

    for (int i = 0; i < n; ++i) {
      red[i][0] = sc.nextInt();
      red[i][1] = sc.nextInt();
    }

    for (int i = 0; i < n; ++i) {
      blue[i][0] = sc.nextInt();
      blue[i][1] = sc.nextInt();
    }

    ArrayList<Integer>[] binds = new ArrayList[n];
    for (int i = 0; i < n; ++i)
      binds[i] = new ArrayList<>();

    for (int j = 0; j < n; ++j) {
      for (int i = 0; i < n; ++i) {
        if (red[j][0] < blue[i][0] && red[j][1] < blue[i][1]) {
          binds[i].add(j);
        }
      }
    }

    System.out.println(match(n, red, binds, 0));
  }

  public static int match(int n, int[][] red, ArrayList<Integer>[] binds, int res) {
    int min = -1;
    int minSize = n + 1;
    for (int i = 0; i < n; ++i) {
      int sz = binds[i].size();
      if (sz > 0 && sz < minSize) {
        min = i;
        minSize = sz;
      }
    }

    if (min == -1) {
      return res;
    }

    ++res;

    int maxX = 0;
    int maxXi = 0;
    int maxY = 0;
    int maxYi = 0;

    for (int i = 0; i < binds[min].size(); ++i) {
      int[] r = red[binds[min].get(i)];
      if (r[0] > maxX) {
        maxX = r[0];
        maxXi = i;
      }
      if (r[1] > maxY) {
        maxY = r[1];
        maxYi = i;
      }
    }

    HashSet<Integer> maxes = new HashSet<>();
    maxes.add(maxXi);
    maxes.add(maxYi);

    int newRes = 0;

    for (int i : maxes) {
      ArrayList<Integer>[] newBinds = new ArrayList[n];
      for (int j = 0; j < n; ++j) {
        newBinds[j] = (ArrayList<Integer>) binds[j].clone();
      }
      int j = newBinds[min].get(i);
      newBinds[min].clear();
      for (ArrayList list : newBinds) {
        list.remove(new Integer(j));
      }
      int next = (match(n, red, newBinds, res));
      if (next > newRes)
        newRes = next;
    }

    return newRes;
  }
}