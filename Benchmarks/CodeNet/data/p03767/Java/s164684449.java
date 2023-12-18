import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {

  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);
    // 1 1 1 2 2 2 7 7 7
    // 721 721 721 771 221 721


    int N = sc.nextInt();
    Long[] team = new Long[N * 3];
    for (int i = 0; i < N; i++) {
      for(int j = 0; j < 3; j++){
        long currNum = sc.nextLong();
        team[(i * 3) + j] = currNum;
      }
    }

    Arrays.sort(team, Collections.reverseOrder());

    long sum = 0;
    for(int i = 0; i < N; i++) {
      sum += team[i * 2];
    }

    System.out.println(sum);
  }
}
