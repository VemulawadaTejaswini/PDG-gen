/* ITP1_6_D */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();

      String[] size = br.readLine().split(" ");
      int n = Integer.parseInt(size[0]);
      int m = Integer.parseInt(size[1]);
      if(n < 1 || n > 100) return;
      if(m < 1 || m > 100) return;

      int[][] matrix1 = new int[n][m];
      int[] matrix2 = new int[m];
      int[] matrix3 = new int[n]; // answer

      // input matrix1
      for(int i = 0; i < n; i++){
        String[] row = br.readLine().split(" ");

        for(int j = 0; j < m; j++){
          int value = Integer.parseInt(row[j]);
          if(value < 0 || value > 1000) return;
          matrix1[i][j] = value;
        }
      }
      // input matrix2
      for(int j = 0; j < m; j++){
        matrix2[j] = Integer.parseInt(br.readLine());
      }

      // calculation
      for(int i = 0; i < n; i++){
        matrix3[i] = 0;
        for(int j = 0; j < m; j++){
          matrix3[i] += matrix1[i][j] * matrix2[j];
        }
        sb.append(matrix3[i] + "\n");
      }
      System.out.print(sb);

    }catch(Exception e){
      System.out.println(e);
    }
  }
}