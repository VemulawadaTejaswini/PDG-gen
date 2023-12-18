import java.util.*;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] Hz = new int[N];
        for (int i = 0; i < N; i++){
            Hz[i] = sc.nextInt();
        }
        int[] Az = new int[M];
        int[] Bz = new int[M];
        for (int i = 0; i < M; i++){
            Az[i] = sc.nextInt();
            Bz[i] = sc.nextInt();
        }

        int[][] matrix = new int[N][N];
        for (int i = 0; i < M; i++){
            if (Hz[Az[i]-1] == Hz[Bz[i]-1]){
//                System.out.println(Az[i]+" "+Bz[i]);
                matrix[Az[i]-1][Bz[i]-1] = -1;
                matrix[Bz[i]-1][Az[i]-1] = -1;
//                System.out.println(matrix[Az[i]-1][Bz[i]-1]);
//                System.out.println(matrix[Bz[i]-1][Az[i]-1]);
            } else {
                matrix[Az[i]-1][Bz[i]-1] =   Hz[Az[i]-1] - Hz[Bz[i]-1];
                matrix[Bz[i]-1][Az[i]-1] = - (Hz[Az[i]-1] - Hz[Bz[i]-1]);
            }
        }
//        for (int i = 0; i < N; i++){
//            for (int j = 0; j < N; j++){
//                System.out.println("i: "+(i+1)+" j: "+(j+1)+" "+matrix[i][j]);
//            }
//        }
        int ans = 0;
        int minus_flg = 0;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if (matrix[i][j] < 0){
                    minus_flg = 1;
                    break;
                }
            }
            if (minus_flg != 1){
                ans++;
            }
            minus_flg = 0;
        }
        System.out.println(ans);
    }
}