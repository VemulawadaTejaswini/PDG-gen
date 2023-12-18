import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int next = 1;
        int count = 0;
        while (numbers[next - 1] != 0) {
            count++;
            if (numbers[next - 1] == 2) {
                System.out.println(count);
                return;
            }
            int tmp = next;
            next = numbers[next - 1];
            numbers[tmp - 1] = 0;
        }

        System.out.println(-1);
    }
}