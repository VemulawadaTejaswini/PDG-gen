import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        boolean sameSign = (x>>31)==(y>>31);

        int result = Math.abs(Math.abs(x) - Math.abs(y)) + (sameSign ? (x > y ? 2 : 0) : 1);

        if (y == 0 && x <= 0)
            System.out.println(Math.abs(x));
        else
            System.out.println(result);
    }
}