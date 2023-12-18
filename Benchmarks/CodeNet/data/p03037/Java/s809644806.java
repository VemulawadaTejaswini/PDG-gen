import java.util.*;
public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    int[] L = new int[M];
    int[] R = new int[M];

    int[] status = new int[N];

    for (int i = 0; i < M; i++) {
      L[i] = sc.nextInt();
      R[i] = sc.nextInt();
    }

    sc.close();

    Arrays.fill(status,1);

    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {

        if (status[j] == 1) {
          if (j < L[i] - 1 || R[i] - 1 < j) {
            status[j] = 0;
          }
        }

      }
    }

    int count = 0;

    for (int i = 0; i < N; i++) {
      if (status[i] == 1) {
        count++;
      }
    }

    System.out.println(count);
 
  }

}