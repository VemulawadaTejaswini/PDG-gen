import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int ab = scanner.nextInt() - scanner.nextInt();

        String result = "";

        if (ab >= 0) {
            result = "delicious";
        } else if (Math.abs(ab) < x) {
            result = "safe";
        } else {
            result = "dangerous";
        }

        System.out.println(result);
    }
}