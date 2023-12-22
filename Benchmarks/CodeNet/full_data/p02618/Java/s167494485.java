import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

  static int d;
  static int[] array_c;
  static int[][] array_s;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    d = sc.nextInt();
    array_c = new int[27];
    array_s = new int[d + 1][27];
    int[] schedule = new int[d + 1];
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 1; i <= 26; i++) {
      array_c[i] = sc.nextInt();
      if(array_c[i] >= 75){
        list.add(i);
      }
    }

    for (int i = 1; i <= d; i++) {
      for (int j = 1; j <= 26; j++) {
        array_s[i][j] = sc.nextInt();
      }
    }

    for (int i = 1; i <= d; i++) {
      int maxc = 1;
      for (int j = 2; j <= 26; j++) {
        if (array_s[i][maxc] < array_s[i][j]) {
          maxc = j;
        }
      }
      schedule[i] = maxc;
    }


    for(Integer i : list){
      int tempScore = calcScore(schedule);
      int[] schedule2 = new int[d + 1];
      System.arraycopy( schedule, 0, schedule2, 0, schedule.length);
      int dx = 10;
      int ii = 1;
      while(dx * i < d){
        schedule2[dx * ii] = i;
        ii++;
      }
      if(tempScore < calcScore(schedule2)){
        System.arraycopy( schedule2, 0, schedule, 0, schedule.length);
      }
    }

    // 最終OUTPUT
    for (int i = 1; i <= d; i++) {
      System.out.println(schedule[i]);
    }
  }

  static int calcScore(int[] schedule) {
    int m = 0;
    HashMap<Integer, Integer> last = new HashMap<>();
    for (int i = 1; i <= d; i++) {
      last.put(schedule[i], i);
      m += array_s[i][schedule[i]];
      for (int j = 1; j <= 26; j++) {
        int lastday = last.get(j) == null ? 0 : last.get(j);
        m -= (i - lastday) * array_c[j];
      }
    }
    return m;
  }
}