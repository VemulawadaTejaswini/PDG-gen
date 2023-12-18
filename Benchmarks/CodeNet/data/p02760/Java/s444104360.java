import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[][] matrix = new int[3][3];
    for (int j = 0; j < 3; j++) {
      for (int i = 0; i < 3; i++) {
        matrix[j][i] = sc.nextInt();
      }
    }
    int N;
    N = sc.nextInt();
    int[] keys = new int[N];
    for (int i = 0; i < N; i++) {
      keys[i] = sc.nextInt();
    }
    sc.close();

    int[][] checked = {{0,0,0},{0,0,0},{0,0,0}};

    for (int i = 0; i < N; i++) {
      for (int y = 0; y < 3; y++) {
        for (int x = 0; x < 3; x++) {
          if(matrix[y][x] == keys[i]) {
            checked[y][x] = 1;
          }
        }
      }
    }
    
    int three1 = 0;
    int three2 = 0;
    int three3 = 0;
    int three4 = 0;
    
    for (int j = 0; j < 3; j++) {
      for (int i = 0; i < 3; i++) {
        three1 += checked[j][i];
      }
      if (three1 == 3) {
        System.out.println("Yes");
        return;
      } else {
        continue;
      }
    }

    for (int j = 0; j < 3; j++) {
      for (int i = 0; i < 3; i++) {
        three2 += checked[i][j];
      }
      if (three2 == 3) {
        System.out.println("Yes");
        return;
      } else {
        continue;
      }
    }

    for (int i = 0; i < 3; i++) {
      three3 += checked[i][i];
      three4 += checked[i][2-i];
    }

    if (three1 >= 3 || three2 >= 3 || three3 >= 3 || three4 >= 3) {
      System.out.println("Yes");
      return;
    } else {
      System.out.println("No");
      return;
    }
  }
}
