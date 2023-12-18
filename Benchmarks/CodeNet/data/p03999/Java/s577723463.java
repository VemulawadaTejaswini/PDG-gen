import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] split = s.toCharArray();
        int digit = s.length();
        long total = 0;
        for (int i = 0; i < Math.pow(2, digit - 1); i++) {
            var sb = new StringBuilder();
            for (int j = 0; j < digit; j++) {
                sb.append(split[j]);
                if ((1 & i >> j) == 1) {
                    sb.append("+");
                }
            }
            for (String num : sb.toString().split("\\+")) {
                total += Long.parseLong(num);
            }
        }
        System.out.println(total);
    }
}
