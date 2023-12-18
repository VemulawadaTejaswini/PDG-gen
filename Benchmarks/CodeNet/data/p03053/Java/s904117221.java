
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);
    int h = cin.nextInt();
    int w = cin.nextInt();
    char[][] matrix = new char[h][w];

    for (int i = 0; i < h; i++) {
      char[] item = cin.next().toCharArray();
//      System.out.println(Arrays.toString(item));
      matrix[i] = item;
    }

    int res = 0;
    while (true) {
      int mark = 0;
      for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
          if (matrix[i][j] == '.') {
            mark = 1;
            if (matrix[Math.max(0, i - 1)][j] == '#' || matrix[Math.min(h-1, i + 1)][j] == '#' ||
                    matrix[i][Math.max(0, j - 1)] == '#' || matrix[i][Math.min(w-1, j + 1)] == '#')
              matrix[i][j] = ',';
          }
        }
      }
      for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
          if (matrix[i][j] == ',') {
            matrix[i][j] = '#';
          }
        }
      }
//      for (char[] item : matrix)
//        System.out.println(Arrays.toString(item));
//      System.out.println(" ");
      if (mark == 0) {
        break;
      } else {
        res++;
      }

    }
    System.out.println(res);

  }

}