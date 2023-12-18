import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < N; i++) {
            min = Math.min(min, sum(i) + sum(N - i));
        }
        System.out.println(min);
    }

    static int sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}