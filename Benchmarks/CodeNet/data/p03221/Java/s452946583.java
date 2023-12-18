import java.util.*;
import java.io.*;

class Main {
  public static TreeMap<Integer, TreeMap<Integer, Integer>> map = new TreeMap<Integer, TreeMap<Integer, Integer>>();
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      int N = sc.nextInt();
      int M = sc.nextInt();

      for (int i = 0; i < M; i++) {
        int P = sc.nextInt();
        int Y = sc.nextInt();
        if (map.containsKey(P)) {
          map.get(P).put(Y, i);
        } else {
          map.put(P, new TreeMap<Integer, Integer>());
          map.get(P).put(Y,i);
        }
      }
      String[] ans = new String[M];
      int count = 0;
      for (Integer i : map.keySet()) {
        count = 0;
        for (Integer j : map.get(i).keySet()) {
          count++;
          ans[map.get(i).get(j)] = String.format("%06d%06d", i, count);
        }
      }
      for (int i = 0; i < M; i++) {
        System.out.println(ans[i]);
      }
    }
  }
}
