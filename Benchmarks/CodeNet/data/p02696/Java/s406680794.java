import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long N = sc.nextLong();

        sc.close();

        long MAX = 0;

        for (int i = 0; i <= N; i++) {
            MAX = (long) Math.max(MAX, Math.floor(A*i/B) - A * Math.floor(i/B));
        }

        System.out.println(MAX);
    }
}
