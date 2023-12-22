import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int result = 0;
        long num = 2019;

        if (S.length() < 4) {
            System.out.println(0);
            return;
        }

        for (int i = 4; i < S.length(); i++) {
            for (int j = 0; j < S.length() - i + 1; j++) {
                if (Long.parseLong(S.substring(j, j + i)) % num == 0) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}