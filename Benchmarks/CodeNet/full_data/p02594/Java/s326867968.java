import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("現在の室温を入力してください");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        if (str.equals("")) {
            System.out.println("室温を入力がされていません");
            return;
        }

        int X = 0;
        try {
            X = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("室温は「整数」で入力してください");
            e.printStackTrace();
        }

        if (X < -40 || 40 < X) {
            System.out.println("室温は-40度～40度で入力してください");
            return;
        }
        if (30 <= X && X <= 40) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }
    }

}
