import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        String S = scan.next();

        scan.close();
        String s = S.toLowerCase();
        int num = S.length();
        if (s == S && num <= 100 && K <= 100) {
            if (K <= num) {
                System.out.println(S.substring(0, K + 1) + "...");
            } else if (K > num) {
                System.out.println(S.substring(0, num + 1));
            }
        }
    }

}