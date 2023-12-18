import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        Long count = 0L;
        for (int i = 0; i < S.length() - 1; i++) {
            for (int j = i + 1; j < S.length(); j++) {
                long value = Long.valueOf(S.substring(i, j+1));
                if (value % 2019 == 0) count++;
            }
        }
        System.out.println(count);
    }
}