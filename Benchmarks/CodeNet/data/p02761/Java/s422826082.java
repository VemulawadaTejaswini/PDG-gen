import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] line1 = br.readLine().split(" ");
    
    int n = Integer.parseInt(line1[0]);
    int m = Integer.parseInt(line1[1]);
    int[][] data = new int[2][m];
    String[] dataStr;
    
    for (int i=0; i<m; i++){
      dataStr = br.readLine().split(" ");
      data[0][i] = 4- Integer.parseInt(dataStr[0]);
      data[1][i] = Integer.parseInt(dataStr[1]);
    }
    
    for (int i=(int)Math.pow(10, n-1); i<Math.pow(10, n); i++){
      for (int j=0; j<m; j++){
        if ((i % (int)(Math.pow(10, data[0][j])))/(int)Math.pow(10, data[0][j]-1) != data[1][j]) {
          break;
        }
        if (j==m-1){
          System.out.println(i);
          return;
        }
      }
    }
    System.out.println(-1);
  }
}
