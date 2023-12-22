import java.util.HashMap;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int[] array_c = new int[27];
    int[][] array_s = new int[d + 1][27];
    int[] schedule = new int[d + 1];
    HashMap<Integer, Integer> last = new HashMap<>();
    for(int i = 1; i <= 26; i++){
      array_c[i] = sc.nextInt();
      last.put(i, 0);
    }
    for(int i = 1; i <=d; i++){
      for(int j = 1; j <= 26; j++){
        array_s[i][j] = sc.nextInt();
      }
    }
    for(int i = 1; i <= d; i++){
      schedule[i] = sc.nextInt();
    }

    int m = 0;
    for(int i = 1; i <= d; i++){
      last.put(schedule[i], i);
      m += array_s[i][schedule[i]];
      for(int j = 1; j <= 26; j++){
        m -= (i - last.get(j)) * array_c[j];
      }
      System.out.println(m);
    }
  }
}