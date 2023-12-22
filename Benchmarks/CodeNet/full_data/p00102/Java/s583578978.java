import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    while (true){
      int n = input.nextInt();
      if (n == 0) break;
      int a[][] = new int[n + 1][n + 1];

      for (int i = 0; i < n; i++){
        for (int j = 0; j < n; j++){
          a[i][j] = input.nextInt();
          a[i][n] += a[i][j];
          a[n][j] += a[i][j];
        }
        a[n][n] += a[i][n];
      }

      for (int i = 0; i < n + 1; i++){
        for (int j = 0; j < n + 1; j++){
          System.out.print(String.format("%5d", a[i][j]));
        }
        System.out.println();
      }
    }
  }
}