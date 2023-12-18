
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int max = L + N - 1;
        int sum = N * L + N * (N - 1) / 2;
        if (L > 0) {
            sum -= L;
        } else if (max < 0) {
            sum -= max;
        }
        System.out.println(sum);
    }
}
