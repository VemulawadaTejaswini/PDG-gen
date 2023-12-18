import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      int N = in.nextInt();
      int D[] = new int[N+1];
      boolean result = false;
      Arrays.fill(D, 0);

      for(int cnt = 0; cnt < N; cnt++) {
          D[cnt] = in.nextInt();
      }

      int M = in.nextInt();

      if(N < M) {
          System.out.println("NO");
          return;
      }

      boolean flag = false;

      for(int cnt = 0; cnt < M; cnt++) {
          int MI = in.nextInt();

          for(int cnt2 = 0; cnt2 < N; cnt2++) {
              if(D[cnt2] == MI) {
                  D[cnt2] = 0;
                  flag = true;
                  break;
              }
              System.out.println("NO");
              return;
          }
      }

      System.out.println("YES");


    }
}