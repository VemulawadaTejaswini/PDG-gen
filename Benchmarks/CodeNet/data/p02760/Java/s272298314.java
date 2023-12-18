import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] A = new int[3][3];
    for (int i = 0; i < 3; i++)
      for (int j = 0; j < 3; j++)
        A[i][j] = sc.nextInt();
    int N = sc.nextInt();
    int[] b = new int[N];
    for (int i = 0; i < N; i++)
      b[i] = sc.nextInt();
    sc.close();

    Set<Integer> bset = new HashSet<>();
    for (int i = 0; i < N; i++)
      bset.add(b[i]);

    boolean[][] bingo = new boolean[3][3];
    for (int i = 0; i < 3; i++)
      for (int j = 0; j < 3; j++)
        if (bset.contains(Integer.valueOf(A[i][j]))) bingo[i][j] = true;

    boolean ans = bingo[0][0] && bingo[0][1] && bingo[0][2]
        || bingo[1][0] && bingo[1][1] && bingo[1][2]
        || bingo[2][0] && bingo[2][1] && bingo[2][2]
            
        || bingo[0][0] && bingo[1][0] && bingo[2][0]
        || bingo[0][1] && bingo[1][1] && bingo[2][1]
        || bingo[0][2] && bingo[1][2] && bingo[2][2]
            
        || bingo[0][0] && bingo[1][1] && bingo[2][2]
        || bingo[0][2] && bingo[1][1] && bingo[2][0];
    System.out.println(ans ? "Yes" : "No");
  }
}