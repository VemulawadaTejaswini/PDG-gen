import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            //数字を受け取る
            int x = sc.nextInt();
            //もし受け取った数字が0なら処理を終了する
            if (x == 0) {
                break;
            }

            System.out.println("Case " + count + ": " + x);
            count++;

        }
    }
}

