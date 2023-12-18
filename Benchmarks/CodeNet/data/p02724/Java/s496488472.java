import java.util.Scanner;

public class Main {
    static char[] c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yen = sc.nextInt();
        int yen500 = yen/500;
        yen -= yen500 * 500;
        int yen5 = yen/5;

        System.out.println(1000*yen500 + 5 * yen5);
    }
}