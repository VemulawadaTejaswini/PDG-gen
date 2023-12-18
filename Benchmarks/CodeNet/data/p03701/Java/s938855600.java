import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] s = new int[N];
    Arrays.sort(s);
    int sum = 0;
    for(int i = 0; i < N; i++) {
      s[i] = sc.nextInt();
      sum += s[i];
    }
    int ans = 0;
    if(sum % 10 != 0) {
      ans = sum;
    } else {
      for(int i = 0; i < N; i++) {
        if((sum - s[i]) % 10 != 0) {
          ans = sum - s[i];
          break;
        }
      }
    }
    System.out.println(ans);
  }
}