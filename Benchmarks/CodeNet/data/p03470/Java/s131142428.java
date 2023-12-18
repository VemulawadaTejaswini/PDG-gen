import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] d = new int[101];
    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      d[a]++;
    }
    int ans = 0;
    for(int i = 0; i < 101; i++) { 
      if(d[i] > 0) ans++;
    }
    System.out.println(ans);
  }
}