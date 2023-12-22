import java.util.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    while(sc.hasNext()) {
      int[] as = new int[4];
      int[] bs = new int[4];

      for(int i = 0; i < 4; i++) as[i] = sc.nextInt();
      for(int i = 0; i < 4; i++) bs[i] = sc.nextInt();

      int hit = 0;
      int blow = 0;

      for(int i = 0; i < 4; i++) {
        for(int j = 0; j < 4; j++) {
          if(as[i] == bs[j]) {
            if(i == j) hit++;
            else blow++;
          }
        }
      }

      System.out.println(hit + " " + blow);
    }
  }

  private final Scanner sc = new Scanner(System.in);
}