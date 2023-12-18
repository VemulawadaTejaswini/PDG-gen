import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int n = 0;

        while(true) {
            int size = s.length();
            s = s.replaceFirst("01", "");
            if (s.length() < size) {
                n += 2;
                continue;
            } else {
                s = s.replaceFirst("10", "");
                if (s.length() < size) {
                    n += 2;
                    continue;
                } else {
                    break;
                }
            }
        }
        System.out.println(n);
    }
}