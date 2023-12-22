import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] strArray = input.split(" ");
        int n = Integer.parseInt(strArray[0]);  //n???
        int m = Integer.parseInt(strArray[1]);  //m???

        int[][] A = new int[n][m];
        int[] b = new int[m];

//      ?????????????????????A????????????????????????
        for(int i = 0; i < A.length; i++){
            input = br.readLine();
            strArray = input.split(" ");
            for(int j = 0; j < A[i].length; j++){
                A[i][j] = Integer.parseInt(strArray[j]);
            }
        }

//      ?????????????????????b?????????????????????
        for(int i = 0; i < b.length; i++){
            input = br.readLine();
            b[i] = Integer.parseInt(input);
        }

//      A??¨b??????????¨??????????
        for(int i = 0; i < A.length; i++){
            int ans = 0;
            for(int j = 0; j < A[i].length; j++){
                ans += A[i][j] * b[j];
            }
            System.out.println(ans);
        }
    }
}