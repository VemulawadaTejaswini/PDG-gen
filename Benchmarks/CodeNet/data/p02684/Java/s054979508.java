import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    long K = in.nextLong();

    List<Integer> numbers = new ArrayList<Integer>();

    for (int i = 0; i < N; i++) {
      numbers.add(in.nextInt() - 1);
    }

    HashMap<Long, List<Integer>> map = new HashMap<>();

    long index = 1L;
    map.put(index, numbers);
    index *= 2L;

    while (index < K) {
      List<Integer> n = new ArrayList<Integer>();
      long preIndex = index / 2;

      for (int i = 0; i < N; i++) {
        int preLoc = map.get(preIndex).get(i);
        int curLoc = map.get(preIndex).get(preLoc);
        n.add(curLoc);
      }

      map.put(index, n);
      index *= 2;
    }

    // Check everything works
    // index = 1L;
    // while (index < K) {
    //   List<Integer> n = map.get(index);
    //   for (Integer i : n) {
    //     System.out.printf("%d ", i);
    //   }
    //   System.out.println();
    //   index *= 2;
    // }

    int ans = 0;
    index /= 2;

    while (index > 0) {
      if (K >= index) {
        ans = map.get(index).get(ans);
        K -= index;
      }
      index /= 2;
    }

    System.out.println(ans + 1);
  }
}