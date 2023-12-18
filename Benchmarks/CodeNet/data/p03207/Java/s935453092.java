import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] p = new int[N];
        for (int i = 0; i < N; i++) {
            p[i] = sc.nextInt();
        }

        int total = 0;
        for (int i : p) {
            total += i;
        }

        int max = 0;
        for (int i : p) {
            if (max < i) {
                max = i;
            }
        }

        System.out.println(total - max / 2);
    }
}
