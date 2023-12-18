import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String[] map = new String[h];
    for (int i = 0; i < h; i++) {
      map[i] = sc.next();
    }
    int count_row = 0;
    int count_line = 0;
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if (map[i].charAt(j) == '#') {
          count_row++;
          break;
        }
      }
    }
    int[] row = new int[count_row];
    int index_row = 0;
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        if(map[i].charAt(j) == '#') {
          row[index_row] = i;
          index_row++;
          break;
        }
      }
    }
    for (int i = 0; i < w; i++) {
      for (int j = 0; j < h; j++) {
        if (map[j].charAt(i) == '#') {
          count_line++;
          break;
        }
      }
    }
    int[] line = new int[count_line];
    int index_line = 0;
    for (int i = 0; i < w; i++) {
      for (int j = 0; j < h; j++) {
        if (map[j].charAt(i) == '#') {
          line[index_line] = i;
          index_line++;
          break;
        }
      }
    }
    for(int i = 0; i < index_row; i++) {
      for(int j = 0; j < index_line; j++) {
        System.out.print(map[row[i]].charAt(line[j]));
      }
      System.out.println("");
    }
  }
}
