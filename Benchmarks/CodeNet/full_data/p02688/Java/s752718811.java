import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // すぬけ君の数
        int K = sc.nextInt(); // お菓子の種類
        int[] d = new int[K];
        int[][] A = new int[N][N];
        int[] sunuke = new int[N];

        for (int i = 0; i < K; i++) {
            d[i] = sc.nextInt();
//            System.out.println(d[i]);
            for (int j = 0; j < d[i]; j++) {
                A[i][j] = sc.nextInt();
//                System.out.print(A[i][j] + " ");
            }
//            System.out.println("");
        }
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < N; j++) {
                sunuke[j] += A[i][j];
            }
        }
        int ans = 0;

        for (int i = 0; i < N; i++) {
            if(sunuke[i]==0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}