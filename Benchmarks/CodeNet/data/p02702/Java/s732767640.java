import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        scan.close();

        if (input.length() < 4) {
            System.out.println(0);
        }
        int cnt = 0;
        StringBuilder buf = new StringBuilder();

        for (int i = 0; i < input.length() - 4; i++) {
            int tmp = Integer.parseInt(input.substring(i, i + 3));
            for (int j = i + 3; j < input.length(); j++) {
                tmp = tmp * 10 + Integer.parseInt(input.substring(j, j + 1));
                if (tmp % 2019 == 0) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}

