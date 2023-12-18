import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int max = 1;

        for (int j = 2; j <= 31; j++) {
            int n = j * j;
            if (n <= x) {
                while (n * j <= x) {
                    n *= j;
                }
                max = Math.max(max, n);
            }

        }

        System.out.println(max);
    }

}
