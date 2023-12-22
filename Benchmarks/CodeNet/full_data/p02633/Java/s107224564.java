import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i;
        int k = 360;
        int j;

        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.err.println("整数を入力してください");
        }

        i = Integer.parseInt(sc.nextLine());

        if (1 <= i && i <= 179) {
            if (k % i == 0) {
                j = k / i;
            } else {
                j = k / i + 1;
            }
            System.out.println(j);
        } else {
            System.out.println("回転する角度は１～１７９の間で入力してください。");
        }
    }
}