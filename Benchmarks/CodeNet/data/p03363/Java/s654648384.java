import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] matrix = new int[N][N];

        for(int i=0; i<N; i++){
            matrix[0][i] = sc.nextInt();
        }

        // N==1
        if(N==1){
            if(matrix[0][0] == 0){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
            return;
        }

        for(int i=1; i<N; i++){
            for(int j=0; i+j<N; j++) {
                matrix[i][j] = matrix[i-1][j] + matrix[0][(i+j)%N];
            }
        }

        int cnt = 0;

        for(int i=0; i<N; i++){
            for(int j=0; i+j<N; j++){
                if(matrix[i][j] == 0){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}