import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // package-private
        final Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        int X = in.nextInt();

        int[] cost = new int[N];
        int[][] contribution = new int[N][M];
        for(int i = 0; i < N; i++) {
            cost[i] = in.nextInt();
            for(int j = 0; j < M; j++) {
                contribution[i][j] = in.nextInt();
            }
        }

        long ans = -1;
        // Força bruta, cada bit significa que escolhi o i-ésimo livro
        for(int i = 0; i < (1 << N); i++) {
            int totalPrice = 0;
            int[] understanding = new int[M];

            for(int j = 0; j < N; j++) {
                // Caso a i-ésima posição é zero, retorna 0
                // 110 & 010 = 2; 110 & 001 = 0
                if((i & (1 << j)) > 0) {
                    // escolhido o j-ésimo livro
                    totalPrice += cost[j];
                    for(int k = 0; k < M; k++) {
                        understanding[k] += contribution[j][k];
                    }
                }
            }

            boolean valid = true;
            for(int j = 0; j < M; j++) {
                if(understanding[j] < X) {
                    valid = false;
                    break;
                }
            }

            if(valid) {
                if(ans == -1) {
                    ans = totalPrice;
                }
                else {
                    ans = Math.min(ans, totalPrice);
                }
            }
        }

        System.out.println(ans);
    }
}