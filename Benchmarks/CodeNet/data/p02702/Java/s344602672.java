import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int N = S.length();

        List<Long> cache = new ArrayList<>();
        List<Long> subStr = new ArrayList<>();

        int result = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 4; j < N + 1; j++) {
                if (Long.parseLong(S.substring(i, j)) % 2019 == 0) {
                    result += 1;
                }
            }
        }
        System.out.println(result);
    }
}