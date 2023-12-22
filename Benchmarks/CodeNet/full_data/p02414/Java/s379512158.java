import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str1 = br.readLine();
    String[] str2 = str1.split(" ");
    int n = Integer.parseInt(str2[0]);
    int m = Integer.parseInt(str2[1]);
    int l = Integer.parseInt(str2[2]);

    int[][] matrixA = new int[n][m];
    int[][] matrixB = new int[m][l];
    int[][] matrixC = new int[n][l];

    for (int i = 0; i < n; i++){
      String[] str3 = br.readLine().split(" ");
      for(int j = 0; j < m; j++){
        matrixA[i][j] = Integer.parseInt(str3[j]);
      }
    }
    for (int i = 0; i < m; i++){
      String[] str4 = br.readLine().split(" ");
      for(int j = 0; j < l; j++){
        matrixB[i][j] = Integer.parseInt(str4[j]);
      }
    }
    for (int i = 0; i < n; i++){
      for (int j = 0; j < l; j++){
        for(int k = 0; k < m; k++){
          matrixC[i][j] += (matrixA[i][k] * matrixB[k][j]);
        }
      }
    }
    for (int i = 0; i < n; i++){
      for (int j = 0; j < l; j++){
        System.out.print(matrixC[i][j] + " ");
      }
      System.out.println();
    }
  }
}