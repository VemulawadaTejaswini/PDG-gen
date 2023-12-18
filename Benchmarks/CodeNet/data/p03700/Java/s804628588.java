import java.util.*;

public class Main {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      String[] param = scan.nextLine().split(" ");

      int n = Integer.parseInt(param[0]);
      int a = Integer.parseInt(param[1]);
      int b = Integer.parseInt(param[2]);

      int[] monsterLive = new int[n];

      for (int i = 0; i < n; i++){
          monsterLive[i] = Integer.parseInt(scan.nextLine());
      }

      int nbAction = 0;

      for (int i = 0; i < n; i++){
          while (monsterLive[i] > 0){
            nbAction++;

            int max = maxInt(monsterLive);
            monsterLive[max] -= a;

            for (int j = i; j < n; j++){
              if (j != max){
                monsterLive[j] -= b;
              }
            }
          }
      }

      System.out.println(nbAction);

    }


    public static int maxInt(int[] elem){
      int max = 0;

      for (int i = 1; i < elem.length; i++){
          if (elem[max] < elem[i]){
            max = i;
          }
      }
      return max;
    }

}
