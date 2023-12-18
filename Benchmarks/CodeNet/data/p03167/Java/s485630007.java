
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int rows;
    static int colomns;
    static int[][] matrix;

    static void table(){
        matrix[0][1] = 1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=colomns;j++){

                if(matrix[i][j]==0) {
                    int a = matrix[i - 1][j];
                    int b = matrix[i][j - 1];

                    if(a<0){
                        a = 0;
                    }
                    if(b<0){
                        b = 0;
                    }

                    matrix[i][j] = (a+b)%1000000007;

                }
            }
        }
    }

    static void ans(){
        System.out.println(matrix[rows][colomns]);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));

        String[] one = inp.readLine().split(" ");
        rows = Integer.parseInt(one[0]);
        colomns = Integer.parseInt(one[1]);

        matrix = new int[rows+1][colomns+1];

        for(int i=1;i<=rows;i++){
            String[] line = inp.readLine().split("");
            for(int j=1;j<=colomns;j++){
                if(line[j-1].equals("#")){
                    matrix[i][j]= -1;
                }
            }
        }

        table();
        ans();


    }
}
