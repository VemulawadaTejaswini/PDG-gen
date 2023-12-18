import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String s = br.readLine();
    char[] c = s.toCharArray();
    int length = c.length;
    long result = 0;
    int[][] array = new int[3][n+1];

    for (int i=0; i<n; i++) {
      if (c[i] == 'R') {
        array[0][i+1] = array[0][i] + 1;
        array[1][i+1] = array[1][i];
        array[2][i+1] = array[2][i];
      } else if (c[i] == 'G') {
        array[0][i+1] = array[0][i];
        array[1][i+1] = array[1][i] + 1;
        array[2][i+1] = array[2][i];
      } else {
        array[0][i+1] = array[0][i];
        array[1][i+1] = array[1][i];
        array[2][i+1] = array[2][i] + 1;
      }
    }
    for (int i=0; i<n; i++){
      char c1 = c[i];
      for (int j=i; j<n; j++){
        if (c[j] != c1) {
          if (c1 != 'R' && c[j] != 'R') {
            result += array[0][n] - array[0][j+1];
          } else if (c1 != 'G' && c[j] != 'G') {
            result += array[1][n] - array[1][j+1];
          } else {
            result += array[2][n] - array[2][j+1];
          }
          if ( 2*j - i < n && c[j + j - i] != c1 && c[j+j-i] != c[j]) {
            result--;
          }
        }
      }
    }
    System.out.println(result);
  }
}
