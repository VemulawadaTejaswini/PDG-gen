import java.util.*;
import java.util.stream.*;

class Main {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var N = scanner.nextInt();
    var M = scanner.nextInt();
    var height = new int[N+1];
    var good = new int[N+1];
    Arrays.fill(good, 1);
    good[0] = 0;
    for(int i = 1; i <= N; i++) {
      height[i] = scanner.nextInt();
    }
    for(int i = 1; i <= M; i++) {
      var v = scanner.nextInt();
      var w = scanner.nextInt();
      if(height[v] < height[w]) good[v] = 0;
      if(height[w] < height[v]) good[w] = 0;
    }
    var target = Arrays.stream(good).sum();
	System.out.println(target);
  }
}
