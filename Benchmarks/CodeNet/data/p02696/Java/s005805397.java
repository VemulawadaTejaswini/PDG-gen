import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        long B = sc.nextLong();
        long N = sc.nextLong();

        sc.close();

        int MAX = 0;

        for (int i = 0; i <= N; i++) {
            int F = Math.floor(A*i/B);
            int G = A * Math.floor(x/B);
            int FG = F - G;
            MAX = Math.max(MAX, FG);
        }

        System.out.println(MAX);
    }
}
