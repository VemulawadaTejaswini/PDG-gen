import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long T = sc.nextLong();
        long[] t = new long[N];
        for (int i = 0; i < N; i++) {
            t[i] = sc.nextLong();
        }

        long sum = 0;
        for (int i = 1; i < N; i++) {
            sum += Math.min(t[i] - t[i - 1], T);
        }
        System.out.println(sum + T);
    }

}
