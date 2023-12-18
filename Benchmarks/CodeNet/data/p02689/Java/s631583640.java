import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int answer = 0;
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] heights = new int[n + 1];
    boolean[] isGood = new boolean[n + 1];
    Arrays.fill(isGood, true);
    for(int i = 1; i <= n; i++){
      heights[i] = sc.nextInt();
    }
    for(int i = 0; i < m; i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      if(heights[a] > heights[b]){
        isGood[b] = false;
      } else if (heights[a] < heights[b]){
        isGood[a] = false;
      } else {
        // heights[a] == heights[b]
        isGood[a] = false;
        isGood[b] = false;
      }
    }
    // TODO Stream
    for(int i = 1; i <= n; i++){
      if(isGood[i] == true) answer++;
    }
    System.out.println(answer);
  }
}