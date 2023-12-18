import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int result = n;
        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (i < j) {
                    if (s[j] == 'E') {
                        count++;
                    }
                } else if (i > j) {
                    if (s[j] == 'W') {
                        count++;
                    }
                }
            }
            if (count < result) {
                result = count;
            }

        }
        System.out.println(result);

    }
}