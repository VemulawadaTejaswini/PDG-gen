/* ITP1_7_D */;
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();

      String[] input = br.readLine().split(" ");
      int n = Integer.parseInt(input[0]);
      int m = Integer.parseInt(input[1]);
      int l = Integer.parseInt(input[2]);

      int[][] matrix_nm = new int[n][m];
      int[][] matrix_ml = new int[m][l];
      int[][] matrix_nl = new int[n][l];

      // input n*m
      for(int i = 0; i < n; i++){
        input = br.readLine().split(" ");
        for(int j = 0; j < m; j++){
          matrix_nm[i][j] = Integer.parseInt(input[j]);
        }
      }
      // input m*l
      for(int i = 0; i < m; i++){
        input = br.readLine().split(" ");
        for(int j = 0; j < l; j++){
          matrix_ml[i][j] = Integer.parseInt(input[j]);
        }
      }
      
      // calculation
      for(int i = 0; i < n; i++){
        for(int j = 0; j < l; j++){
          for(int k = 0; k < m; k++){
            matrix_nl[i][j] += matrix_nm[i][k] * matrix_ml[k][j];
          }
          if(j != 0) sb.append(" ");
          sb.append(matrix_nl[i][j]);
        }
        sb.append("\n");
      }
      System.out.print(sb);

    }catch(Exception e){
      System.out.println(e);
    }
  }
}