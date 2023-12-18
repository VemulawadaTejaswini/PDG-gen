import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int d = sc.nextInt();
    Map<Integer, int[]> map = new HashMap<>();
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        int[] tmp = {i, j};
        map.put(sc.nextInt(), tmp);
      }
    }
    int q = sc.nextInt();
    Map<String, Integer> memo = new HashMap<>();
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < q; i++) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      String memoKey = sb.append(l).append("-").append(r).toString();
      sb.setLength(0);
      int magic = 0;
      if(memo.get(memoKey) != null) {
        magic = memo.get(memoKey);
        l = r;
      }
      while(l < r) {
        int[] tmp1 = map.get(l);
        l += d;
        int[] tmp2 = map.get(l);
        magic += Math.abs(tmp1[0] - tmp2[0]) + Math.abs(tmp1[1] - tmp2[1]);
      }
      memo.put(memoKey, magic);
      System.out.println(magic);
    }
  }
}