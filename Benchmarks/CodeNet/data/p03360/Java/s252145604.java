import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int max = Math.max(A, Math.max(B, C));
        int K = sc.nextInt();
        int ans = A + B + C - max;
        for(int i = 0; i < K; i++) max *= 2;
        System.out.println(ans + max);
        sc.close();

    }

}
