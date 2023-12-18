import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    ArrayList<Integer> dislike = new ArrayList<Integer>();
    for(int i = 0; i < K; i++) {
      int a = sc.nextInt();
      dislike.add(a);
    }
    int ans = N;
    for(int i = N; i < 100 * N; i++) {
      int count = 0;
      ans = i;
      while(i > 0) {
        int digit = i % 10;
        i /= 10;
        if(dislike.contains(digit)) count++;
      }
      if(count == 0) break;
    }
    System.out.println(ans);
  }
}