import java.util.*;

public class Main {
   
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[][] s = new int[N][2];
    for (int i = 0; i < N; i++) {
      s[i][0] = sc.nextInt();
      s[i][1] = sc.nextInt();
    }
    Arrays.sort(s, (a,b)->b[1]-a[1]);
    
    Map<Integer, Integer> map = new HashMap<>();
    long ans = 0;
    for (int i = 0; i < K; i++) {
      ans += s[i][1];
      map.put(s[i][0], map.getOrDefault(s[i][0],0)+1);
    }
    long x = map.keySet().size();
    ans += x*x;
    
    //System.out.println(map);
    
    long tmp = ans;
    int r = K;
    int l = K-1;
    while (0 < l && r < N) {
      while (0 < l && map.get(s[l][0]) == 1) {
        l--;
      }
      while (r < N && map.containsKey(s[r][0])) {
        r++;
      }
      if (l != 0 && r != N) {
        long x2 = map.keySet().size();
        tmp = tmp-s[l][1]+s[r][1]+(x2+1)*(x2+1)-x2*x2;
        map.put(s[l][0], map.get(s[l][0])-1);
        map.put(s[r][0], 1);
        ans = Math.max(ans, tmp);
        //System.out.println(map);
      }
    }
    System.out.println(ans);
  }
}