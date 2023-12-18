import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String S = sc.next();
        final long K = sc.nextLong();


        char c = 1;
        int index = S.length();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '1') {
                c = S.charAt(i);
                index = i;
                break;
            }
        }

        if (K <= index) {
            System.out.println(1);
        } else {
            System.out.println(c);
        }
    }
}
