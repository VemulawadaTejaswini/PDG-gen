import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        int count = 0;
        int e = 0;
        while (e <= S.length() || 4 < S.length()) {
            e = 4;
            for (int i = 0; i < S.length(); i++) {
                e++;
                if (S.length() < e) {
                    S = S.substring(1);
                    break;
                }
                if (Long.parseLong(S.substring(0, e)) % 2019 == 0) {
                    count++;
                    S = S.substring(e - 1);
                    break;
                }
            }
        }
        System.out.println(count);
    }
}