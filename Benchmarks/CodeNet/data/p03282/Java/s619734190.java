import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        long K = sc.nextLong();

        for (int i = 0; i <= K - 1; i++) {
            if (S.charAt(i) != '1') {
                System.out.println(S.charAt(i));
                return;
            }
        }

        System.out.println('1');
    }
}