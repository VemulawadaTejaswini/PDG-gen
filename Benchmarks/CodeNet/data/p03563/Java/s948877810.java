import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int g = scanner.nextInt();

        // レーティングの計算式に引数を当てはめる
        System.out.println(2 * g - r);
    }
}
