import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    int[][] p = new int[M][4];

    for (int i = 0; i < M; i++) {
      p[i][0] = i;
      p[i][1] = sc.nextInt();
      p[i][2] = sc.nextInt();
    }

    sc.close();

    Arrays.sort(p, (o1, o2) -> o1[1] == o2[1] ? o1[2] - o2[2] : o1[1] - o2[1]);

    int now = 0;
    int count = 1;

    for (int i = 0; i < M; i++) {
      if(now == p[i][1]){
        count++;
      } else {
        now = p[i][1];
        count = 1;
      }
      p[i][3] = count;
    }

    Arrays.sort(p, (o1, o2) -> o1[0] - o2[0]);

    for (int i = 0; i < M; i++) {
      System.out.println(String.format("%06d%06d", p[i][1], p[i][3]));
    }

  }

}