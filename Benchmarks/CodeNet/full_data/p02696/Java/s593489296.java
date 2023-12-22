import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long N = sc.nextLong();

        long max = 0;
        for (int x = 1; x <= N; x++) {
            long ans = Math.floorDiv(A * x, B) - (A * Math.floorDiv(x, B));
            if (max < ans) {
                max = ans;
            }
        }
        System.out.println(max);
    }
}