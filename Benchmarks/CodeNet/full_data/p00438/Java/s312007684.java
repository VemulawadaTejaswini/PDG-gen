import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner cin = new Scanner(System.in);
    int a, b;
    while (true){
      a = cin.nextInt();
      b = cin.nextInt();
      if (a == 0 && b == 0) break;
      int m[][] = new int[a][b];
      int n = cin.nextInt();
      for (int i = 0; i < n; i++){
        int x, y;
        x = cin.nextInt();
        y = cin.nextInt();
        m[x - 1][y - 1] = -1;
      }
      for (int i = 0; i < a; i++){
        for (int j = 0; j < b; j++){
          if (m[i][j] == -1){
            m[i][j] = 0;
            continue;
          }
          if (i == 0 || j == 0){
            m[i][j] = 1;
          }
          else {
            m[i][j] = m[i - 1][j] + m[i][j - 1];
          }
        }
      }
      System.out.println(m[a - 1][b - 1]);
    }
  }
}