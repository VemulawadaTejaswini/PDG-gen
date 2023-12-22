// http://icpc.iisf.or.jp/past-icpc/regional2016/problems.pdf
// problem C

// ng: 15-34
import java.util.*;

public class C {
  public static void main(String[] args) {
    // int n = 4;
    // int arms[] = {1, 3, 2};

    Scanner scan = new Scanner(System.in);
    String line = scan.nextLine();
    int n = Integer.parseInt(line.split(" ")[0]);
    int m = Integer.parseInt(line.split(" ")[1]);

    // int arms[] = new int[m];
    Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
    for (int i = 0; i < m; i++) {
      line = scan.nextLine();
      int x = Integer.parseInt(line.split(" ")[0]);
      int y = Integer.parseInt(line.split(" ")[1]);

      map.put(x, y);
    }

    Integer arms[] = map.values().toArray(new Integer[m]);
    // System.out.println(map.values());
    //
    // System.exit(0);

    // for (int arm: arms) {
    //   System.out.println(arm);
    // }



    int nums[] = new int[n + 1];
    boolean visited[] = new boolean[n + 1];
    for (int i = 1; i <= n; i++) {
      nums[i] = 1;
      visited[i] = false;
    }

    for (int arm: arms) {
      // System.out.println(arm + " " + visited[arm]);
      if (!visited[arm]) {
        int i = nums[arm + 1];
        int j = nums[arm];
        nums[arm] += i;
        nums[arm + 1] += j;
        visited[arm] = true;
      } else {
        int i = nums[arm + 1];
        int j = nums[arm];

        nums[arm] = Math.max(i, j);
        nums[arm + 1] = Math.max(i, j);
      }
    }

    for (int i = 1; i <= n; i++) {
      if (i > 1) System.out.print(" ");
      System.out.print(nums[i]);
    }
    System.out.println();
  }
}