import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String YES = "Yes";
        String NO = "NO";

        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        
        int turu = Y - 2 * X;
        if(turu < 0 || turu%2 != 0) {
            System.out.println(NO);
            return;
        }
        turu = turu/2;
        int kame = X-turu;
        if(kame < 0) {
            System.out.println(NO);
            return;
        }
        System.out.println(YES);
    }
}