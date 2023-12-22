import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        System.out.println("Nを入力してください。");

        final int inputNum = sc.nextInt();

        // 入力された値の一の位を取得したい

        final int digit1 = inputNum % 10;

        switch (digit1) {
            case 2, 4, 5, 7, 9:
                System.out.println("hon");
                break;
            case 0, 1, 6, 8:
                System.out.println("pon");
                break;
            case 3:
                System.out.println("bon");
                break;
        }

        sc.close();

    }
}