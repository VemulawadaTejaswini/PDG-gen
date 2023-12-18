import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();

        int[] C = new int[N];
        int[][] A = new int[N][M];

        for(int i = 0 ; i < N ; i++){
            C[i] = sc.nextInt();
            for(int j = 0 ; j < M ; j++){
                A[i][j] = sc.nextInt();
            }
        }

        int costMin = (int)1e8;
        for(int k = 0 ; k < (1 << N) ; k++){
            int[] rikai = new int[M];
            int cost = 0;
            for(int i = 0 ; i < N ; i++){
                if((k & (1 << i)) > 0){
                    for(int j = 0 ; j < M ; j++){
                        rikai[j] += A[i][j];
                    }
                    cost += C[i];
                }
            }
            int rikaiMin = X;
            for(int j = 0 ; j < M ; j++){
                rikaiMin = Math.min(rikaiMin, rikai[j]);
            }
            if(rikaiMin == X) {
                costMin = Math.min(cost, costMin);
            }
        }

        if(costMin == (int)1e8){
            costMin = -1;
        }
        System.out.println(costMin);
    }
}
