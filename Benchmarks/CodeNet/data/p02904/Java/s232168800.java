import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] P = new int[N];
        int[] Q = new int[N];
        for(int i=0;i<N;i++){
            P[i] = sc.nextInt();
        }
        int sum=1;

        for(int i=0;i<N-K;i++){
            if (P[i] > P[i + 1] || P[i + K-1] > P[i+K]) {
                sum++;
            }
        }
        System.out.println(sum);
        // 出力
//        System.out.println((a + b + c) + " " + s);
    }
}