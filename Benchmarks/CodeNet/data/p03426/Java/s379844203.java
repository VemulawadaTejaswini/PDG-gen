import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      int d = sc.nextInt();
      Map<Integer, int[]> posMap = new HashMap<>();
      int[][] matrix = new int[h][w];
      for(int i = 0; i < h; i++) {
        for(int j = 0; j < w; j++) {
          posMap.put(sc.nextInt(), new int[]{i, j});
        }
      }
      int q = sc.nextInt();
      Map<Integer, Long> memo = new HashMap<>();
      for(int i = 0; i < q; i++) {
        int l = sc.nextInt();
        int r = sc.nextInt();
        int key = l*301 + r;
		if(memo.containsKey(key)) {
          	System.out.println(memo.get(key));
        	continue;
        }
        long sum = 0;
        while(l < r) {
          int subKey = l * 301 + r;
          if(memo.containsKey(subKey)) {
          		sum += memo.get(subKey);
                continue;
          }
          int[] p1 = posMap.get(l);
          l += d;
          int[] p2 = posMap.get(l);
          long subSum = Math.abs(p2[0] - p1[0]) + Math.abs(p2[1] - p1[1]);
          memo.put(subKey, subSum);
          sum += subSum;
        }
        memo.put(key, sum);
        System.out.println(sum);
      }
  }
}
