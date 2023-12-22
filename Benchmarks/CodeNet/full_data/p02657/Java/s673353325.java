import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long multiple = 1;

        for (int i = 0; i < n; i++) {
            multiple *= scanner.nextLong();
        }

        if (multiple > (long)Math.pow(10, 18)) {
            System.out.println(-1);
        } else {
            System.out.println(multiple);
        }
    }
}
