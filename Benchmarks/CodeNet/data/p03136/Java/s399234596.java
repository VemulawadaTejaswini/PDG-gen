import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] L = new int[N];

        int M = 0, S = 0;
        for (int i = 0; i < N; ++i){
            L[i] = sc.nextInt();
            M = Math.max(M, L[i]);
            S += L[i];
        }

        System.out.println(2 * M < S ? "Yes" : "No");

        sc.close();
    }
}