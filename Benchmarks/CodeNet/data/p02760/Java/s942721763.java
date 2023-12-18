import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String [] commandLineArgument){

        Scanner input = new Scanner(System.in);
        int [][] matrix = new int[3][3];
        for(int i = 0; i < 3; ++i){
            for(int j = 0; j < 3; ++j){
                matrix[i][j] = input.nextInt();
            }
        }
        int [][] quadSum = new int[3][3];
        for(int i = 0; i < 3; ++i){
            Arrays.fill(quadSum[i] , 0);
        }
        int n = input.nextInt();
        int [] b = new int[n];
        for(int k = 0; k < n; ++k){
            b[k] = input.nextInt();
            for(int i = 0; i < 3; ++i){
                int brk = 0;
                for(int j = 0; j < 3; ++j){
                    if(matrix[i][j] == b[k]){
                        ++quadSum[i][j];
                        brk = 1;
                        break;
                    }
                }
                if(brk == 1){
                    break;
                }
            }
        }
        boolean status = true;
        for(int i = 0; i < 3; ++i){
            status = true;
            for(int j = 0; j < 3; ++j){
                if(quadSum[i][j] == 0){
                    status = false;
                    break;
                }
            }
            if(status){
                break;
            }
        }
        for(int j = 0; j < 3; ++j){
            status = true;
            for(int i = 0; i < 3; ++i){
                if(quadSum[i][j] == 0){
                    status = false;
                    break;
                }
            }
            if(status){
                break;
            }
        }
        if(quadSum[0][0] != 0 && quadSum[1][1] != 0 && quadSum[2][2] != 0){
            status = true;
        }
        if(quadSum[0][2] != 0 && quadSum[1][1] != 0 && quadSum[2][0] != 0){
            status = true;
        }
        String answer = (status) ? "Yes" : "No";
        System.out.println(answer);
        input.close();
    }
}
