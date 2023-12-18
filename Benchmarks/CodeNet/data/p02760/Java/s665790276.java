import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int[][] a = new int[3][3];
    boolean[][] s = new boolean[3][3];
    for(int i=0; i<3; i++) {
      String[] str = in.readLine().split(" ");
      for(int j=0; j<3; j++) {
        a[i][j] = Integer.parseInt(str[j]);
      }
    }
    
    int n = Integer.parseInt(in.readLine());
    int[] b = new int[n];
    for(int i=0; i<n; i++) {
      b[i] = Integer.parseInt(in.readLine());
      for(int j=0; j<3; j++) {
        for(int k=0; k<3; k++) {
          if(a[j][k]==b[i])
            s[j][k] = true;
        }
      }
    }
    System.out.println(bingo(s)?"Yes":"No");
  }
  
  private static boolean bingo(boolean[][] s) {
    boolean hantei = false;
    for(int i=0; i<3; i++){
      hantei |= s[i][0] && s[i][1] && s[i][2];
      hantei |= s[0][i] && s[1][i] && s[2][i];
    }
    hantei |= s[0][0] && s[1][1] && s[2][2];
    hantei |= s[0][2] && s[1][1] && s[2][0];
    return hantei;
  }
}