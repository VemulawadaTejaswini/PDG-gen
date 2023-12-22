import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int K = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(can(K, A, B) ? "OK" : "NG");
        }
    }

    private static boolean can(int k, int a, int b) {
        for (int n = 1; n * k <= b; n++) {
            if (n * k >= a && n * k <= b) {
                return true;
            }
        }
        return false;
    }
}
