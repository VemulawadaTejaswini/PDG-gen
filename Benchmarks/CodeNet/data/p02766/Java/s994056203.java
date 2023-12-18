import java.util.Scanner;

public class Main {

    private static int taskOne(int n, int k) {
        return 0;
    }

    private static int taskTwo(long n, int k) {
        int cnt = 0;

        while (n > 0) {
            n /= k;
            cnt += 1;
        }

        return cnt > 0 ? cnt : 1;
    }

    private static int taskThree() {
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(taskTwo(n, k));
    }
}