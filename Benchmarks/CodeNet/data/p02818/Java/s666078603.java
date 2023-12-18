import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] s = str.split(" ");
        long takahashi = Long.parseLong(s[0]);
        long aoki = Long.parseLong(s[1]);
        long cookieCount = Long.parseLong(s[2]);

        for (int count = (int) cookieCount; count >= 0; count--) {

            if (takahashi > 0) {
                takahashi--;
                continue;
            }

            if (aoki > 0) {
                aoki--;
                continue;
            }
        }

        System.out.println(takahashi + " " + aoki);
    }
}