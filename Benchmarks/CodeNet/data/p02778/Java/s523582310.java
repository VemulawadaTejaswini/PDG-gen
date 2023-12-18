import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        int len = s.length();
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < len; i++) {
            sb.append("x");
        }
        System.out.println(sb.toString());
    }
}