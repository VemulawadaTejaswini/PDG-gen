import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        float avg = (a + b) / 2.0f;
        int res = (int) avg;
        if (avg * 10 % 10 > 0) {
            res++;
        }

        System.out.println(res);
        scanner.close();
    }
}
