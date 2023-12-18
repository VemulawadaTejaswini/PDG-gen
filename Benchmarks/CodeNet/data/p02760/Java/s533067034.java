import java.util.*;

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[][] b = new int[3][3];
      for(int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
              b[i][j] = sc.nextInt();
          }
      }
      int N = sc.nextInt();
      for (int i = 0; i < N; i++) {
          int t = sc.nextInt();
          for (int j = 0; j < 3; j++) {
              for (int k = 0; k < 3; k++) {
                  if (b[j][k] == t) {
                      b[j][k] = 0;
                  }
              }
          }
      }
      String ret = "No";
      for(int i = 0; i < 3; i++) {
              if (bingo(b[i][0],b[i][1],b[i][2])) {
                  ret = "Yes";
                  break;
              }
              if (bingo(b[0][i],b[1][i],b[2][i])) {
                  ret = "Yes";
                  break;
              }
      }
      if (bingo(b[0][0],b[1][1],b[2][2]) || bingo(b[2][0],b[1][1],b[0][2])) {
          ret = "Yes";
      }
      System.out.println(ret);
  }
  static boolean bingo(int a, int b, int c) {
      return a == b && b == c;
  }
}
