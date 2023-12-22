import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      if (n == 0) {
        break;
      }
      scanner.nextLine();
      List<aaaa> ts = new ArrayList<aaaa>();
      for (int ii = 0; ii < n; ii++) {
        String[] works = scanner.nextLine().split(" ");
        int ww = 0;
        int ll = 0;
        for (int jj = 1; jj < n; jj++) {
          if (works[jj].equals("0")) {
            ww++;
          } else if (works[jj].equals("1")) {
            ll++;
          }
        }
        aaaa aaa = new aaaa(works[0], ww, ll, ii);
        //aaa.t = works[0];
        ts.add(aaa);
      }
      Collections.sort(ts, new ac());
for (aaaa el : ts) {
      System.out.println(el.t);
}
    }
  }

  private static class aaaa {
    public String t;
    public int ww;
    public int ll;
    public int ii;
    public aaaa (String ta, int wwa, int lla, int iia) {
      t = ta;
      ww = wwa;
      ll = lla;
      ii = iia;
    }
  }

  private static class ac implements Comparator<aaaa> {
    public int compare(aaaa a, aaaa b) {
      if (a.ww > b.ww) {
        return 0;
      } else if (a.ww < b.ww) {
        return 1;
      } else {
        if (a.ll < b.ll) {
          return 1;
        } else if (a.ll > b.ll) {
          return 0;
        } else {
          if (a.ii > b.ii) {
            return 0;
          } else if (a.ii < b.ii) {
            return 1;
          } else {
            return -1;
          }
          //return -1;
        }
        //return -1;
      }
    }
  }

}