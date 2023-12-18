import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    // x*(x-1)/2 >= N;
    int x = 1;
    while ((long)x*(x+1)/2 < N) {
      x++;
    }
    long diff = (long)x*(x+1)/2 - N;
    StringBuilder ans = new StringBuilder();
    for (int i = 1; i <= x; i++) {
      if (i == diff) continue;
      ans.append(i).append('\n');
    }
    System.out.println(ans.toString());
  }
}