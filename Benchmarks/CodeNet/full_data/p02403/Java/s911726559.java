import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 標準入力からデータを読み込む準備
        Scanner sc = new Scanner(System.in);
        // 最初の文字の固まりを整数値と想定して読み込む
        while () {
            // int H = sc.nextInt();
            // int W = sc.nextInt();
            int H = 5;
            int W = 5;
            if (H == 0 && W == 0) {
                break;
            }
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    System.out.print("#");
                }
                System.out.println("");
            }
        }
    }
}
