import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        sc.close();

        int max = 0;
        for (int x = 4; x <= N; x++) {
            int letMax = (int) (A * x / B) - A * (int) (x / B);
            if (letMax >= max) {
                max = letMax;
            }
        }

        System.out.println(max);
    }
}