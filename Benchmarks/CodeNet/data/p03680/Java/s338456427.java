import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt() - 1;
        }

        int index = 0;
        int count = 1;
        while (count < N) {
            index = a[index];
            if (index == 1) {
                System.out.println(count);
                return;
            }
            count++;
        }

        System.out.println(-1);
    }

}
