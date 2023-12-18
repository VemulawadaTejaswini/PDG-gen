import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
    for(int i = 0; i < m; i++) {
      int k = sc.nextInt();
      ArrayList<Integer> list = new ArrayList<Integer>();
      for(int j = 0; j < k; j++) {
        int s = sc.nextInt();
        list.add(s - 1);
      }
      map.put(i, list);
    }
    int[] p = new int[m];
    for(int i = 0; i < m; i++) {
      p[i] = sc.nextInt();
    }

    int ans = 0;
    for(int i = 0; i < (int)Math.pow(2, n); i++) {
      int t = 1;
      for(int j = 0; j < m; j++) {
        ArrayList<Integer> list2 = map.get(j);
        int sum = 0;
        for(int k = 0; k < list2.size(); k++) {
          if((i & (1 << list2.get(k))) != 0) sum++;
        }
        if((sum % 2) != p[j]) t = 0;
      }
      if(t == 1) ans++;
    }
    System.out.println(ans);
  }
}