import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int n = 0;

        while(true) {
            int size = s.length();
            s = s.replaceAll("01", "");
            if (s.length() < size) {
                n += size - s.length();
                continue;
            } else {
                s = s.replaceAll("10", "");
                if (s.length() < size) {
                    n += size- s.length();
                    continue;
                } else {
                    break;
                }
            }
        }
        System.out.println(n);
    }
}