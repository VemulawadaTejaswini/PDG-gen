
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

 //   Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
    int m = cin.nextInt();

    int[][] tem = new int[n][m];
    int[][] record = new int[m][2];
    for (int i=0;i<m;i++) {
      int p = cin.nextInt();
      int y = cin.nextInt();
      tem[p-1][i] = y;
      record[i][0] = p;
      record[i][1] = y;
    }

    String[] st = new String[m];
    int count = 0;
    for (int i=0;i<n;i++) {
      int[] row = tem[i];
      Arrays.sort(row);
      int rank = 1;
      for (int j=0;j<m;j++) {
        if (row[j]!=0) {
          String item = "" + (i+1) + row[j] + String.format("%06d", i+1) + String.format("%06d", rank);
          st[count] = item;
          count++;
          rank++;
        }
      }
    }

    for (int i=0;i<m;i++) {
      int p = record[i][0];
      int y = record[i][1];
      String pre = "" + p + y;
      for (int j=0;j<m;j++) {
        if (st[j].startsWith(pre)) {
          System.out.println(st[j].substring(pre.length(), st[j].length()));
        }
      }
    }

  }

}