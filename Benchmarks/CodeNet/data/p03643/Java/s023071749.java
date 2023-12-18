import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner
        Scanner sc = new Scanner(System.in);

        // ロード
        int N = Integer.parseInt(sc.next());

        // 出力
        System.out.println("ABC" + String.format("%03d", N));

        // scanner
        sc.close();
    }
}
