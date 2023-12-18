import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        String s = sc.next();

        String t = sc.next();

        {
            String tmp = s;
            s = t;

            t = tmp;
        }
        System.out.println(s + t);
    }
}