import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;

        for (int a = 0; a < N; a++) {
            if (!(a % 3 == 0 || a % 5 == 0)) {
                sum += a;
            }
        }
        System.out.println(sum);
    }
}