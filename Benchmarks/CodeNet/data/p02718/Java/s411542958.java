import java.util.*;
import java.io.BufferedInputStream;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner (new BufferedInputStream(System.in));
    int n = sc.nextInt();
    int m = sc.nextInt();
    int total = 0;
    PriorityQueue<Integer> st = new PriorityQueue<>();
    for(int i = 0; i < n; ++i) {
        int now = sc.nextInt();
        st.offer(0 - now);
        total += now;
    }
    boolean res = true;
    for(int i = 0; i < m; ++i) {
        int now = 0 - st.poll();
        if(now < (double) total / 4 * m) res = false;
    }
    if(res) System.out.println("Yes");
    else System.out.println("No");
  }
}