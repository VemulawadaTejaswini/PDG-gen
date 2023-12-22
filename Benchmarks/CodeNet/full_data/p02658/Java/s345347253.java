import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long ans = 1;
    long INF = 1000000000000000000L;
    ArrayList<Long> list = new ArrayList<>();
    for (int i=0; i<N; i++) {
        long num = sc.nextLong();
        list.add(num);
    }
    for (int i=0; i<N; i++) {
    	ans *= list.get(i);
        if (ans > INF){
          ans = -1;
          break;
        }
    }
    if (list.contains(0L)) {
      ans = 0;
    }
    System.out.println(ans);
  }
}