import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(pow(x, 3));
    }

    private static int pow(int x, int exp) {
        if (exp == 0) return 1;
        return x * pow(x, exp - 1);
    }
}