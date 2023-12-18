import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[][] A = new int[2][N];

        for(int i=0; i<2; i++){
            for(int j=0; j<N; j++){
                A[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<2; i++){
            for(int j=0; j<N; j++){
                if(i == 1){
                    if(j >=  1){
                        A[i][j] = Math.max(A[i][j]+A[i-1][j], A[i][j]+A[i][j-1]);
                    }else{
                        A[i][j] =A[i][j]+A[i-1][j];
                    }
                }else{
                     if(j >= 1){
                        A[i][j] = A[i][j]+ A[i][j-1];
                    }
                }
            }
        }

        System.out.println(A[1][N-1]);
    }
}
