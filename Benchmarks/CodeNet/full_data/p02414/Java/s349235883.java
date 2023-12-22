import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input =  br.readLine();
        String[] strArray = input.split(" ");

        int n = Integer.parseInt(strArray[0]);
        int m = Integer.parseInt(strArray[1]);
        int l = Integer.parseInt(strArray[2]);

        int[][] A = new int[n][m];
        int[][] B = new int[m][l];

        StringBuilder sb = new StringBuilder();

//      ??????A???????????????
        for(int i = 0; i < n; i++){
            input = br.readLine();
            strArray = input.split(" ");

            for(int j = 0; j < m; j++){
                A[i][j] = Integer.parseInt(strArray[j]);
            }
        }

//      ??????B???????????????
        for(int i = 0; i < m; i++){
            input = br.readLine();
            strArray = input.split(" ");

            for(int j = 0; j < l; j++){
                B[i][j] = Integer.parseInt(strArray[j]);
            }
        }

//      A???B????¨??????????
        for(int i = 0; i < n; i++){
            for(int j = 0; j < l; j++){
                int ans = 0;
                for(int k = 0; k < m; k++){
                    ans += A[i][k] * B[k][j];
                }
                if(j != l-1){
                    sb.append(ans).append(" ");
                }else{
                    sb.append(ans).append("\n");
                }
            }
        }
        System.out.print(sb);

    }
}