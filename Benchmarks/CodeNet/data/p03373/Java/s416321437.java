import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int nab = ((int)Math.max(X,Y)) * 2;
        int answer = Integer.MAX_VALUE;
        while(true) {
            int x = X - nab/2; if ( x < 0 ) { x = 0; }
            int y = Y - nab/2; if ( y < 0 ) { y = 0; }
            int v = x * A + y * B + nab * C;
            if ( v < answer ) {
                answer = v;
            }
            nab = nab - 2;
            if ( nab < 0 ) {
                break;
            }
        };
        System.out.println(answer);
    };
  }
}