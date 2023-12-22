import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long ans = 1;
    long INF = 1000000000;
    long[] array = new long [N];
    for (int i=0; i<N; i++) {
        long num = sc.nextLong();
        array[i] = num;
        if (num == 0) {
          ans = 0;
        }
    }
    for (int i=0; i<N; i++) {
    	ans *= array[i];
        if (ans > INF*1000000000 && ans != 0){
          ans = -1;
          break;
        }
    }
    System.out.println(ans);
  }
}