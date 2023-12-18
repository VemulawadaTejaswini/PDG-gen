import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();

        int length = S.length();
        long total = 0;

        // bit全探索
        // 集合 (1, 2, 3) の部分集合(1, 12, 123 など) の種類で回す (2のn乗 == Math.pow(2, S))
        for (int i = 0; i < (1 << length - 1); i++) {
            String first = String.valueOf(S.charAt(0));
            StringBuilder sb = new StringBuilder(first);

            for (int j = 0; j < length - 1; j++) {
                if (((i >> j) & 1) == 1) {
                    // 間に+を挿入
                    sb.append("+");
                }
                sb.append(S.charAt(j + i));
            }

            String[] ss = sb.toString().split("\\+");
            for (String s : ss) {
                total += Long.parseLong(s);
            }
        }

        System.out.println(total);
    }
}
