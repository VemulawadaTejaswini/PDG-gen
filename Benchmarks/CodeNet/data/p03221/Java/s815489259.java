import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    int M = scn.nextInt();

    ArrayList<CityInfo> city = new ArrayList<>();
    for (int i = 0; i < M; i++) {
      int P = scn.nextInt();
      int Y = scn.nextInt();

      city.add(new CityInfo(P, Y, i));
    }

    Collections.sort(city, new Comparator<CityInfo>() {
      public int compare(CityInfo c1, CityInfo c2) {
        return (c1.year > c2.year) ? 1 : -1;
      }
    });

    HashMap<Integer, Integer> serialNo = new HashMap<>();
    String[] IDlist = new String[M];
    for (CityInfo info : city) {
      if (!serialNo.containsKey(info.prefNo)) {
        serialNo.put(info.prefNo, 1);
      } else {
        serialNo.put(info.prefNo, serialNo.get(info.prefNo) + 1);
      }
      IDlist[info.order] = String.format("%06d%06d", info.prefNo, serialNo.get(info.prefNo));

    }

    for (String id : IDlist) {
      System.out.println(id);
    }

  }

  private static class CityInfo {
    private int prefNo;
    private int year;
    private int order;

    CityInfo(int P, int Y, int i) {
      this.prefNo = P;
      this.year = Y;
      this.order = i;
    }
  }

}
