import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            
            String strMatrixSize = null;
            
            // 入力の終わりまで読み込みを行う
            while (!"0".equals((strMatrixSize = br.readLine()))) {
                
                int matrixSize = Integer.parseInt(strMatrixSize) + 1;
                int[][] matrix = new int[matrixSize][matrixSize];
                // 行のループ
                for (int row = 0; row < matrixSize - 1; row ++) {

                    String readLine = br.readLine();
                    String[] column = readLine.split(" ");
                    // 列のループ
                    for (int col = 0; col < matrixSize - 1; col ++) {
                        
                        int num = Integer.parseInt(column[col]);
                        // ループの行・列位置に格納
                        matrix[row][col] = num;
                        // 行の右端に加算
                        matrix[row][matrixSize - 1] += num;
                        // 列の下端に加算
                        matrix[matrixSize - 1][col] += num;
                    }
                    matrix[matrixSize - 1][matrixSize - 1] += matrix[row][matrixSize - 1]; 
                }
                // 表示
                for (int row = 0; row < matrixSize; row ++) {
                    for (int col = 0; col < matrixSize; col ++) {
                        System.out.printf("%5d", matrix[row][col]);
                    }
                    System.out.println();
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
    
}