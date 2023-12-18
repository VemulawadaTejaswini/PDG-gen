import java.util.*;
import java.io.BufferedInputStream;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner (new BufferedInputStream(System.in));
    int x = sc.nextInt();
    int y = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    Long[] pa = new Long[a];
    Long[] pb = new Long[b];
    Long[] pc = new Long[c];
    for(int i = 0; i < a; ++i) {
      pa[i] = sc.nextLong();
    }
    for(int i = 0; i < b; ++i) {
      pb[i] = sc.nextLong();
    }
    for(int i = 0; i < c; ++i) {
      pc[i] = sc.nextLong();
    }
    Arrays.sort(pa, new Comparator<Long>() {
      public int compare(Long x, Long y) {
        if(x > y) return -1;
        else return 1;
      }
    });
    Arrays.sort(pb, new Comparator<Long>() {
      public int compare(Long x, Long y) {
        if(x > y) return -1;
        else return 1;
      }
    });
    Arrays.sort(pc, new Comparator<Long>() {
      public int compare(Long x, Long y) {
        if(x > y) return -1;
        else return 1;
      }
    });
    PriorityQueue<Long> st = new PriorityQueue<>();
    for(int i = 0; i < x; ++i) {
      st.offer(pa[i]);
    }
    for(int i = 0; i < y; ++i) {
      st.offer(pb[i]);
    }
    for(int i = 0; i < c; ++i) {
      long now = st.peek();
      if(pc[i] >= now) {
        st.poll();
        st.offer(pc[i]);
      } else break;
    }
    long res = 0;
    for(Long i : st) {
      res += i;
    }
    System.out.println(res);
  }
}
