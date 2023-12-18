
import java.util.Scanner;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        double n=gl();
        double m=gl();
        double d=gl();
        double ans =0;
        if (d==0) {
        	ans = (m-1)/n;
        } else {
        	ans = (m-1) * 2 * (n-d)/ n/n;
        }
        System.out.println(ans);
    }


    // 文字列として入力を取得
    public static String gs() {
         return scanner.next();
    }

    // intとして入力を取得
    public static int gi() {
         return Integer.parseInt(scanner.next());
    }

    // longとして入力を取得
    public static long gl() {
         return Long.parseLong(scanner.next());
    }

    // doubleとして入力を取得
    public static double gd() {
         return Double.parseDouble(scanner.next());
    }
}