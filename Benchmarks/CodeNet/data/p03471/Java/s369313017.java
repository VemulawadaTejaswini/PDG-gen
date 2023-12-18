import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      int N = in.nextInt();
      int M = in.nextInt();

      int x = 0;
      int y = 0;
      int z = 0;

      for(int cnt = 0;cnt < N; cnt++) {
          if(M / 10000 > 0) {
              x = M / 10000;
              M = M % 10000;
          }
          else if(M / 5000 > 0) {
              y = M / 5000;
              M = M % 5000;
          }
          else if(M / 1000 > 0) {
              z = M / 1000;
              M = M % 1000;
          }
      }

      if(x + y + z > N) {
          x = -1;
          y = -1;
          z = -1;
      }

      System.out.println(x + " " + y + " " + z);
    }

}
