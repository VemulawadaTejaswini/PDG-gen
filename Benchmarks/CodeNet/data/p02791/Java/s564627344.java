import java.util.*;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int count = N;
    int[] P = new int[N];

    for (int i = 0; i < N; i++) {
      P[i] = sc.nextInt();
      for (int j = 0; j <= i; j++) {
        if (P[i] > P[j]){
          count--;
          break;
        }
      }
    }
    System.out.print(count);
  }
}