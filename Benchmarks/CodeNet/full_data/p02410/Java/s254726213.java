import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO 自動生成されたメソッド・スタブ
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        int[][] matrix = new int[m][n];
        int[] num = new int[n];


        for(int i = 0;i < m;i++){
            String[] line = br.readLine().split(" ");
            for(int j = 0;j < n;j++){
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }
        for(int i = 0;i < n;i++){
            num[i] = Integer.parseInt(br.readLine());            ;
        }

        for(int i = 0;i < m;i++){
            int result = 0;
            for(int j = 0;j < n;j++){
            result += matrix[i][j] * num[j];
            }
            System.out.println(result);
        }

    }

}
