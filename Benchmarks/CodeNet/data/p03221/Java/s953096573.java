import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    // idx, P, Y
    int[][] city = new int[M][3];
    for (int i = 0; i < M; i++) { 
      city[i][0] = i;
      city[i][1] = sc.nextInt();
      city[i][2] = sc.nextInt();
    }
    
    Arrays.sort(city, (a, b) -> a[2] - b[2]);

    String[] ans = new String[M];
    // P vs cityCount
    int[] cityCount = new int[N+1];
    for (int i = 0; i < M; i++) {
      int cityIdx = city[i][0];
      int p = city[i][1];
      cityCount[p]++;
      
      ans[cityIdx] = genCityId(p, cityCount[p]);
    }

    for (int i = 0; i < M; i++) {
      System.out.println(ans[i]);
    }
  }
  
  private static String genCityId(int p, int count) {
    return String.format("%06d%06d", p, count);
  }
}