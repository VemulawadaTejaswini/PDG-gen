import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = sc.nextInt();

    int[] a = new int[m];
    for (int i = 0; i < m; i++) {
      a[i] = 0;
    }
    long sum = 0;
    int count = 0;

    // 値段の安い順に並び替えたいので一旦Mapに入れる
    Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
    int[] mapkey = new int[n];
    for (int i = 0; i < n; i++) {
      Integer c = sc.nextInt();
      mapkey[i] = c;
      List<Integer> list = new ArrayList<Integer>();
      for (int j = 0; j < m; j++) {
        list.add(sc.nextInt());
      }
      map.put(c, list);
    }

    // キーでソートする
    Arrays.sort(mapkey);

    for (Integer c : mapkey) {
      sum += c;
      List<Integer> list = map.get(c);
      for (int j = 0; j < list.size(); j++) {
        if (a[j] >= x) {
          continue;
        }
        Integer a2 = list.get(j);
        a[j] += a2;
        if (a[j] >= x) {
          count++;
          if (count >= m) {
            System.out.println(sum);
            sc.close();
            return;
          }
        }
      }

    }

    System.out.println(-1);
    sc.close();
  }
}