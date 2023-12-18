import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int n = 0;

        boolean flag01 = true;
        boolean flag10 = true;
        while (flag01 || flag10) {
            int size = s.length();
            flag01 = true;
            flag10 = true;
            s = s.replaceAll("01", "");
            if (s.length() < size) {
                n += size - s.length();
                continue;
            } else flag01 = false;

            s = s.replaceAll("10", "");
            if (s.length() < size) {
                n += size - s.length();
                continue;
            } else flag10 = false;

        }
        System.out.println(n);
    }
}