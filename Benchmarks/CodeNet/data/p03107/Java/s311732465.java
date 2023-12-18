import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int n = 0;

        boolean flag = true;
        while (flag) {
            int size = s.length();
            s = s.replaceAll("(0(\\1+)?1)|(1(\\1+)?0)", "");
            if (s.length() < size) {
                n += size - s.length();
                continue;
            } else flag = false;
        }
        System.out.println(n);
    }
}