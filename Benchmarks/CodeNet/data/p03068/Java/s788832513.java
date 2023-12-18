import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        String s = std.next();
        int k = std.nextInt();

        char target = s.charAt(k - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (target != s.charAt(i)) {
                sb.append('*');
            } else {
                sb.append(s.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }
}
