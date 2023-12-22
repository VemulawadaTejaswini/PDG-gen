import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        String S = scan.next();

        scan.close();
        String s = S.toLowerCase();
        if (s == S && S.length() <= 100 && K <= 100) {
            if (K <= S.length()) {
                System.out.println(S.substring(0, (K + 1)) + "...");
            } else {
                System.out.println(S);
            }
        }
    }

}